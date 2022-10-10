package com.lingyun.study.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        Properties properties = new Properties();
        properties.setProperty("minActive", "10");
        properties.setProperty("maxActive", "200");
        properties.setProperty("maxIdle", "0");//最大等待连接中的数量，设置为0时，表示没有限制
        properties.setProperty("maxWait", "0");//最大等待秒数，单位为毫秒， 超过时间会报出错误信息；
        properties.setProperty("removeAbandoned", "true");
        properties.setProperty("removeAbandonedTimeout", "60");
        ds.setConnectionProperties(properties);
        ds.setDriverClassName("org.h2.Driver");
        ds.setUrl("jdbc:h2:~/spring_cloud_study;AUTO_SERVER=TRUE");
        ds.setUsername("sa");
        ds.setPassword("123456");
        return ds;
    }
}
