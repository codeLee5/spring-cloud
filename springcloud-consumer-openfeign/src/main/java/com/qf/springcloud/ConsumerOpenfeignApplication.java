package com.qf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.qf.springcloud.service"})
public class ConsumerOpenfeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerOpenfeignApplication.class, args);
    }

}
