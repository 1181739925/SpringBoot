package com.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @author 1181739925@qq.com LiuLinQiu
 * @date 2019/11/24 - 17:44
 */
@Configuration
public class JdbcConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource jdbcDataSource(){
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        return dataSource;
    }

}
