package com.lingyun.study.springcloud.domain.payment.controller;

import com.lingyun.study.springcloud.common.CommonResult;
import com.lingyun.study.springcloud.domain.payment.entity.Payment;
import com.lingyun.study.springcloud.domain.payment.service.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
public class PaymentRestController {
    private PaymentService paymentService;
    //原谅我喜欢用构造器注入
    public PaymentRestController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/detail/{id}")
    public CommonResult<Payment> findById(@PathVariable Long id){
        Payment payment = paymentService.findEntityById(id);
        return new CommonResult<>(200,null,payment);
    }
}
