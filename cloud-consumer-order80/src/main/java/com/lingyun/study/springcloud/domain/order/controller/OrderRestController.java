package com.lingyun.study.springcloud.domain.order.controller;

import com.lingyun.study.springcloud.common.CommonResult;
import com.lingyun.study.springcloud.domain.payment.entity.Payment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderRestController {
    private final String paymentUrl="http://localhost:8001";
    private RestTemplate restTemplate;
    public OrderRestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @PostMapping("/api/consumer/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        return restTemplate.postForEntity(paymentUrl+"/api/payment/create",payment,CommonResult.class).getBody();
    }
    @GetMapping("/api/consumer/payment/detail/{id}")
    public CommonResult findById(@PathVariable Long id){
        return restTemplate.getForEntity(paymentUrl+"/api/payment/detail/"+id,CommonResult.class).getBody();
    }
}
