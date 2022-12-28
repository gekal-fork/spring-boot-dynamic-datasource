package com.cxs.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/*
 * @Project:spring-boot-dynamic-datasource-demo
 * @Author:cxs
 * @Motto:放下杂念,只为迎接明天更好的自己
 * */
@Configuration
@MapperScan(basePackages = "com.cxs.mapper")
public class MybatisConfig {

    @Bean("dataSourceOrder")
    @ConfigurationProperties(prefix = "spring.datasource-order")
    public DataSource dataSourceOrder(){
        return DruidDataSourceBuilder.create().build();
    }

    @Bean("dataSourceShop")
    @ConfigurationProperties(prefix = "spring.datasource-shop")
    public DataSource dataSourceShop(){
        return DruidDataSourceBuilder.create().build();
    }

}
