package com.lingyun.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableEurekaClient
@EnableCircuitBreaker
@SpringBootApplication
        (scanBasePackages = {
                "com.lingyun.study.**.controller",
                "com.lingyun.study.**.service",
                "com.lingyun.study.**.config"
        })
@EnableJpaRepositories(basePackages = {"com.lingyun.study.**.repo"})
@EntityScan(basePackages ={"com.lingyun.study.**.entity"})
public class PaymentMain8001 {
        public static void main(String[] args) {

                SpringApplication.run(PaymentMain8001.class, args);
        }

}
