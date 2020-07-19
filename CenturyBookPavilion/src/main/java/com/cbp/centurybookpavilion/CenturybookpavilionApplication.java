package com.cbp.centurybookpavilion;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@MapperScan("com.cbp.centurybookpavilion.mapper")
public class CenturybookpavilionApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(CenturybookpavilionApplication.class, args);
    }

}
