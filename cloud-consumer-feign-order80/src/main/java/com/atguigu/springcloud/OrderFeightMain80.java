package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by liliang on 2021.06.17
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeightMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeightMain80.class, args);
    }
}
