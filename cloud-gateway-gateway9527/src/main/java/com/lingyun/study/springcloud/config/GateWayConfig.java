package com.lingyun.study.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes
                .route("tests", r -> r.path("/api/test/**").uri("lb://CLOUD-PAYMENT-SERVICE"))
                .route("sites", r -> r.path("/google").uri("https://www.google.com.hk"))
                .route("sites", r -> r.path("/twitter").uri("https://twitter.com"))
                .route("sites", r -> r.path("/youtube").uri("https://www.youtube.com"));
        return routes.build();
    }
}
