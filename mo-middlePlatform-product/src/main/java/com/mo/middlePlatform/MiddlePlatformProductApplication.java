package com.mo.middlePlatform;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.sql.DataSource;

/**
 * Created by mo on 2020/11/9
 */
@SpringBootApplication(exclude = {MybatisAutoConfiguration.class})
public class MiddlePlatformProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(MiddlePlatformProductApplication.class, args);
    }
}
