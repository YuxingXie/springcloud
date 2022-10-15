package com.lingyun.study.springcloud.domain.payment.controller;

import com.lingyun.study.springcloud.common.CommonResult;
import com.lingyun.study.springcloud.domain.payment.entity.Payment;
import com.lingyun.study.springcloud.domain.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

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
    public CommonResult<Payment> findById(@PathVariable Long id){
        Payment payment = paymentService.findEntityById(id);
        if (payment==null){
            return new CommonResult<>(404,"没有相关记录",null);
        }
        return new CommonResult<>(200,"查询成功："+serverPort,payment);
    }
}
