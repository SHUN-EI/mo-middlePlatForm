package com.mo.middlePlatform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by mo on 2020/11/5
 */
@MapperScan("com.mo.middlePlatform.mapper")
@SpringBootApplication
public class MiddlePlatformMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiddlePlatformMemberApplication.class, args);
    }
}
