package com.lingyun.study.springcloud.domain.payment.entity;

import java.io.Serializable;


public class Payment implements Serializable,IPayment {

    private Long id;

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
