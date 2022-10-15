package com.lingyun.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
@SpringBootApplication(
        scanBasePackages = {"com.lingyun.study.**.controller","com.lingyun.study.**.config"}
)
@EnableEurekaClient
@EnableDiscoveryClient
public class OrderMain80 implements ApplicationListener<ContextRefreshedEvent> {
        public static void main(String[] args){

                SpringApplication.run(OrderMain80.class, args);
        }

        @Override
        public void onApplicationEvent(ContextRefreshedEvent event) {

        }
}
