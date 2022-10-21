package com.lingyun.study.springcloud.domain.order.service;

import com.lingyun.study.springcloud.common.CommonResult;
import com.lingyun.study.springcloud.domain.payment.entity.Payment;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;


@Component
public class OrderFeignHystrixService implements OrderFeignService{
    public CommonResult<Payment> create(Payment payment) {
        return new CommonResult<>(444,"80 port's create call back",null);
    }

    public CommonResult<Payment> findById(@PathVariable(value = "id") Long id) {
        return new CommonResult<>(444,"80 port's findById call back",null);
    }
}
