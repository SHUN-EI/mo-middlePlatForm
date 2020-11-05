package com.mo.middlePlatform;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * Created by mo on 2020/11/5
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class MiddlePlatformAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiddlePlatformAdminApplication.class, args);
    }

}
