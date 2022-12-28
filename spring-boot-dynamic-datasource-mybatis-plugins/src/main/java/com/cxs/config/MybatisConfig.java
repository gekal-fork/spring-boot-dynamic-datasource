package com.cxs.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.cxs.constant.TypeEnum;
import com.cxs.plugins.DynamicDataSourcePlugin;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/*
 * @Project:spring-boot-dynamic-datasource-demo
 * @Author:cxs
 * @Motto:放下杂念,只为迎接明天更好的自己
 * */
@Configuration
@MapperScan(basePackages = "com.cxs.mapper")
public class MybatisConfig {

    @Bean("master")
    @ConfigurationProperties(prefix = "spring.datasource-w")
    public DataSource dataSourceW(){
        return DruidDataSourceBuilder.create().build();
    }

    @Bean("slave")
    @ConfigurationProperties(prefix = "spring.datasource-r")
    public DataSource dataSourceR(){
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    public Interceptor dynamicDataSourcePlugin(){
        return new DynamicDataSourcePlugin();
    }
}
