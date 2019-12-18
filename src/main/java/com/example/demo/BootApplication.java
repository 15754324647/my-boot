package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author graciano
 * @date 13:56 2019/12/1
 **/
@EnableSwagger2
@SpringBootApplication(scanBasePackages = "com.example.demo")
@MapperScan({"com.example.demo.wxy.mapper"})
public class BootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }

}
