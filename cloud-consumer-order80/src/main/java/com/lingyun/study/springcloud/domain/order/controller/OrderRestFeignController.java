package com.lingyun.study.springcloud.domain.order.controller;

import com.lingyun.study.springcloud.common.CommonResult;
import com.lingyun.study.springcloud.domain.order.service.OrderFeignService;
import com.lingyun.study.springcloud.domain.payment.entity.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer/payment/feign")//不要和OrderRestController定义的url冲突了
public class OrderRestFeignController {
    private OrderFeignService orderFeignService;
    public OrderRestFeignController(OrderFeignService orderFeignService) {
        this.orderFeignService = orderFeignService;
    }
    @GetMapping("/create/{id}")
    public CommonResult create(@PathVariable Long id) {
        Payment payment = new Payment();
        payment.setId(id);
        payment.setSerial("serial is "+id);
        return orderFeignService.create(payment);
    }
    @GetMapping("/get/{id}")
    public CommonResult findById(@PathVariable Long id){
        return orderFeignService.findById(id);
    }
}
