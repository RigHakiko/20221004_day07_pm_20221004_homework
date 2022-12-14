package com.group6.mp1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.group6.mp1.mapper")
public class Day07Pm20221004HomeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day07Pm20221004HomeworkApplication.class, args);
    }

}
