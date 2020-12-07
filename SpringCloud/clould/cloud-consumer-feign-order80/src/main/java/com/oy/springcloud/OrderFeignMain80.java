package com.oy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author OY
 * @Date 2020/10/15
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain80 {
     public static void main(String[] args) {
           SpringApplication.run(OrderFeignMain80.class, args);
      }
}
