package com.lingyun.study.springcloud.domain.order.controller;

import com.lingyun.study.springcloud.common.CommonResult;
import com.lingyun.study.springcloud.domain.payment.entity.Payment;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderRestController {
//    private final String paymentUrl="http://localhost:8001";
    private final String paymentUrl="http://CLOUD-PAYMENT-SERVICE";
    private RestTemplate restTemplate;
    public OrderRestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @GetMapping("/consumer/payment/create/{id}")
    public CommonResult create(@PathVariable Long id) {
        Payment payment = new Payment();
        payment.setId(id);
        payment.setSerial("serial is "+id);
        return restTemplate.postForEntity(paymentUrl+"/api/payment/create",payment,CommonResult.class).getBody();
    }
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult findById(@PathVariable Long id){
        return restTemplate.getForEntity(paymentUrl+"/api/payment/detail/"+id,CommonResult.class).getBody();
    }
    @Resource
    private DiscoveryClient discoveryClient;

}
