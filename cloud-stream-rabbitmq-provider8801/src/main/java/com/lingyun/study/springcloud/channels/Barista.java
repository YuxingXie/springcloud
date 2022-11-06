package com.lingyun.study.springcloud.channels;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
//Barista n. 咖啡师；咖啡吧员
public interface Barista {
    //@Input应该缺少相应的消费者的配置，所以启动报错，暂时注释一下
    @Input("orders")
    SubscribableChannel orders();

    @Output("hotDrinks")
    MessageChannel hotDrinks();

    @Output("coldDrinks")
    MessageChannel coldDrinks();
}
