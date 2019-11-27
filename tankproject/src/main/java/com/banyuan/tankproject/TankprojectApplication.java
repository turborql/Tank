package com.banyuan.tankproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.banyuan.tankproject.mapper")
@SpringBootApplication
public class TankprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(TankprojectApplication.class, args);
    }

}
