package com.lingyun.study.springcloud.domain.payment.entity;

import com.lingyun.study.springcloud.common.entites.IPayment;
import com.lingyun.study.springcloud.domain.payment.service.PaymentService;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Payment implements Serializable, IPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column
    private String serial;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}
