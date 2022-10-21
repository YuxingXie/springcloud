package com.lingyun.study.springcloud.domain.payment.controller;

import cn.hutool.core.util.IdUtil;
import com.lingyun.study.springcloud.common.CommonResult;
import com.lingyun.study.springcloud.domain.payment.entity.Payment;
import com.lingyun.study.springcloud.domain.payment.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.hystrix.contrib.javanica.conf.HystrixPropertiesManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/api/payment")
public class PaymentRestController {
    @Value("${server.port}")
    private String serverPort;
    private PaymentService paymentService;
    //原谅我喜欢用构造器注入
    public PaymentRestController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/create")
    public CommonResult<Payment> create(@RequestBody Payment payment){
        payment = paymentService.save(payment);
        return new CommonResult<>(200,"插入成功:"+serverPort,payment);
    }
    @GetMapping("/detail/{id}")

    @HystrixCommand(fallbackMethod ="findByIdFallback",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
            @HystrixProperty(name = HystrixPropertiesManager.EXECUTION_ISOLATION_THREAD_TIMEOUT_IN_MILLISECONDS,value = "3000")
    })
    public CommonResult<Payment> findById(@PathVariable Long id){
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Payment payment = paymentService.findEntityById(id);
        if (payment==null){
            return new CommonResult<>(404,"没有相关记录",null);
        }
        return new CommonResult<>(200,"查询成功："+serverPort,payment);
    }
    public CommonResult<Payment> findByIdFallback(@PathVariable Long id) {
        return new CommonResult<>(444,"服务器繁忙，请稍后重试！");
    }
    // 熔断----begin
    @HystrixCommand(fallbackMethod ="testCircuitBreakerFallback",commandProperties = {
            @HystrixProperty(name = HystrixPropertiesManager.CIRCUIT_BREAKER_ENABLED,value = "true"),
            @HystrixProperty(name = HystrixPropertiesManager.CIRCUIT_BREAKER_REQUEST_VOLUME_THRESHOLD,value = "10"),
            @HystrixProperty(name = HystrixPropertiesManager.CIRCUIT_BREAKER_SLEEP_WINDOW_IN_MILLISECONDS,value = "10000"),
            @HystrixProperty(name = HystrixPropertiesManager.CIRCUIT_BREAKER_ERROR_THRESHOLD_PERCENTAGE,value = "60"),
    })
    public CommonResult<Payment> testCircuitBreaker(@PathVariable Long id){
        if (id<0){
            throw new RuntimeException("--------------------- id can't be negative-----------------");
        }
        String serialNumber = IdUtil.simpleUUID();
        return new CommonResult<>(200,Thread.currentThread().getName()+"\t 调用成功：流水号："+serialNumber);
    }
    public CommonResult<Payment> testCircuitBreakerFallback(@PathVariable Long id){

        return new CommonResult<>(444,"id "+id+" can't be negative");
    }

    // 熔断----end
}
