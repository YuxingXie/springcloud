package com.lingyun.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.io.IOException;

@SpringBootApplication
        (scanBasePackages = {
                "com.lingyun.study.**.controller",
                "com.lingyun.study.**.service",
                "com.lingyun.study.**.config"
        })
@EnableJpaRepositories(basePackages = {"com.lingyun.study.**.repo"})
@EntityScan(basePackages ={"com.lingyun.study.**.entity"})
public class PaymentMain8001 implements ApplicationListener<ContextRefreshedEvent> {
        public static void main(String[] args) throws IOException {

                SpringApplication.run(PaymentMain8001.class, args);
        }

        @Override
        public void onApplicationEvent(ContextRefreshedEvent event) {

        }
}
