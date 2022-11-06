package com.lingyun.study.springcloud.send;

import com.lingyun.study.springcloud.channels.Barista;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class SendingDrink {
    private Barista barista;

    //如果barista未被检测为一个bean，应该是@EnableBinding中未被指定
    public SendingDrink(Barista barista) {
        this.barista = barista;
    }
    public void sendHotDrinks(String drink){
        barista.hotDrinks().send(MessageBuilder.withPayload(drink).build());
    }
    public void sendColdDrinks(String drink){
        barista.coldDrinks().send(MessageBuilder.withPayload(drink).build());
    }
}
