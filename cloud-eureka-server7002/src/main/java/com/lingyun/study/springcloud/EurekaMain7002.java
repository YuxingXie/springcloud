package com.lingyun.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 implements ApplicationListener<ContextRefreshedEvent> {
        public static void main(String[] args){

                SpringApplication.run(EurekaMain7002.class, args);
        }

        @Override
        public void onApplicationEvent(ContextRefreshedEvent event) {

        }
}
