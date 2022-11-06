package com.lingyun.study.springcloud.channels;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface BarCustomer {


    @Input("hotDrinks")
    MessageChannel hotDrinks();

    @Input("coldDrinks")
    MessageChannel coldDrinks();
}
