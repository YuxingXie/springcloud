package com.lingyun.study.springcloud.domain.order.service;

import com.lingyun.study.springcloud.common.CommonResult;
import com.lingyun.study.springcloud.domain.payment.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


//有了OrderFeignHystrixService这个@Component注解可以没有，但建议留着，
// 注释掉的话spring bean的OrderFeignService实例类型是OrderFeignHystrixService，
// 不注释掉的的话spring会通过aspectJ生成一个代理类，这个代理通过OrderFeignHystrixService实现，并且它的id是orderFeignService。
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE",fallback = OrderFeignHystrixService.class)
//@RequestMapping("/api/payment")//有了FeignClient注解的fallback属性后，放这里不行了

public interface OrderFeignService {
    @PostMapping("/api/payment/create")
//    @HystrixCommand
    CommonResult<Payment> create( Payment payment);

    @GetMapping("/api/payment/detail/{id}")
//    @HystrixCommand
    CommonResult<Payment> findById(@PathVariable(value = "id") Long id);
}
