package com.lingyun.study.springcloud.receive;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public class ReceiveDrink {
    private MessageChannel coldDrinks;

    public ReceiveDrink(MessageChannel coldDrinks) {
        this.coldDrinks = coldDrinks;
    }
    @StreamListener("coldDrinks")
    public void receiveColdDrink(Message<String> coldDrinks){
        String drinks=coldDrinks.getPayload();
        System.out.println("customer get cold drink:"+drinks);
    }
}
