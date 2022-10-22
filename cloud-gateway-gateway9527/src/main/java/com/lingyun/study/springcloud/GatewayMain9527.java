package com.lingyun.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

@SpringBootApplication
@EnableEurekaClient
public class GatewayMain9527 implements ApplicationListener<ContextRefreshedEvent> {
        public static void main(String[] args){

                SpringApplication.run(GatewayMain9527.class, args);
        }

        @Override
        public void onApplicationEvent(ContextRefreshedEvent event) {

        }
}
