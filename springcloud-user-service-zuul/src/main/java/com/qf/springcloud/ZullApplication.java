package com.qf.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZullApplication {

    public static void main(String[] args) {
        System.err.println("哈哈哈哈");
        SpringApplication.run(ZullApplication.class, args);
    }

}
