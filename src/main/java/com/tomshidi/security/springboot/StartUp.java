package com.tomshidi.security.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description
 * @Author TomShiDi
 * @Date 2020/11/8 13:51
 **/
@SpringBootApplication
@MapperScan(basePackageClasses = StartUp.class)
public class StartUp {
    public static void main(String[] args) {
        SpringApplication.run(StartUp.class, args);
    }
}
