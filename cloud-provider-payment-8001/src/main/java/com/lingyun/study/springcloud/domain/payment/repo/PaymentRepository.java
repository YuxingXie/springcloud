package com.lingyun.study.springcloud.domain.payment.repo;

import com.lingyun.study.springcloud.domain.payment.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long>{
    List<Payment> findBySerial(String serial);
}
