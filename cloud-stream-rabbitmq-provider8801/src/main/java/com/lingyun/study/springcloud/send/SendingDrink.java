package com.lingyun.study.springcloud.send;

import com.lingyun.study.springcloud.channels.Barista;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class SendingDrink {
    private Barista barista;
    private MessageChannel coldDrinks;

    //如果barista未被检测为一个bean，应该是@EnableBinding中未被指定

    public SendingDrink(Barista barista, MessageChannel coldDrinks) {
        this.barista = barista;
        this.coldDrinks = coldDrinks;
    }

    public boolean sendHotDrinks(String drink){
        return barista.hotDrinks().send(MessageBuilder.withPayload(drink).build());
    }
    public boolean sendColdDrinks(String drink){
        return coldDrinks.send(MessageBuilder.withPayload(drink).build());
    }
}
