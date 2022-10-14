package com.lingyun.study.springcloud.domain.payment.service;

import com.lingyun.study.springcloud.common.CommonService;
import com.lingyun.study.springcloud.domain.payment.entity.Payment;
import com.lingyun.study.springcloud.domain.payment.repo.PaymentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService extends CommonService<Payment,Long, PaymentRepository> implements PaymentRepository {
    private PaymentRepository paymentRepository;
    //不用Autowired也不用Resource注解，使用构造器注入，相信我，这个方法更好。
    public PaymentService(PaymentRepository paymentRepository) {
        super(paymentRepository);
        this.paymentRepository = paymentRepository;
    }


    public List<Payment> findBySerial(String serial) {
        return this.paymentRepository.findBySerial(serial);
    }



}
