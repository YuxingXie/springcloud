//package com.lingyun.study.springcloud.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.converter.HttpMessageConverter;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//
//import java.util.List;
//
//@Configuration
//public class MappingJacksonConfig  extends WebMvcConfigurationSupport {
//    protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        converters.add(converter());
//        addDefaultHttpMessageConverters(converters);
//    }
//
//    @Bean
//    public MappingJacksonHttpMessageConverter converter() {
//        MappingJacksonHttpMessageConverter converter = new MappingJacksonHttpMessageConverter();
//        //do your customizations here...
//        return converter;
//    }
//}