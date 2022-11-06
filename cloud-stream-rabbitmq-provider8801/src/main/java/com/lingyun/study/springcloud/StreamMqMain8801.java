package com.lingyun.study.springcloud;

import com.lingyun.study.springcloud.channels.BarCustomer;
import com.lingyun.study.springcloud.channels.Barista;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableEurekaClient
@EnableBinding({Barista.class, BarCustomer.class})
public class StreamMqMain8801 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMqMain8801.class,args);
    }
}
