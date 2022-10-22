package com.lingyun.study.springcloud.domain.order.entity;

import com.lingyun.study.springcloud.common.entites.IOrder;
import com.lingyun.study.springcloud.common.entites.IPayment;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "the_order")//避免表名与sql关键字order冲突
public class Order implements Serializable, IOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String description;
    private Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
