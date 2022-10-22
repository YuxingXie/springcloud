package com.lingyun.study.springcloud.common.entites;

public interface IOrder {
    Long getId();

    void setId(Long id);


    String getDescription() ;

    void setDescription(String description) ;

    Double getPrice() ;

    void setPrice(Double price) ;
}
