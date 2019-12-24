package com.example.demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 启动spring boot 的方式之一:SpringBootServletInitializer的执行过程，简单来说就是通过SpringApplicationBuilder构建并封装SpringApplication对象，并最终调用SpringApplication的run方法的过程。
 * 使用外置的tomcat启动
 * jar包和war包启动区别
 * jar包:执行SpringBootApplication的run方法,启动IOC容器,然后创建嵌入式Servlet容器
 * war包:  先是启动Servlet服务器,服务器启动Springboot应用(springBootServletInitizer),然后启动IOC容器
 *
 * @author limeiqi
 */
//@SpringBootConfiguration
public class ServletInitializer extends SpringBootServletInitializer {

    //    public static void main(String[] args) {
    //        SpringApplication.run(ServletInitializer.class, args);
    //    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BootApplication.class);
    }

}
