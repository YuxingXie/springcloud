package com.lingyun.study.springcloud.domain.order.service;

import com.lingyun.study.springcloud.common.CommonResult;
import com.lingyun.study.springcloud.domain.payment.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
@RequestMapping("/api/payment")
public interface OrderFeignService {
    @PostMapping("/create")
    CommonResult<Payment> create( Payment payment);

    @GetMapping("/detail/{id}")
    CommonResult<Payment> findById(@PathVariable(value = "id") Long id);
}
