package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
* @Author OY
* @Date  2020/11/13 
*/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9003 {
     public static void main(String[] args) {
           SpringApplication.run(PaymentMain9003.class, args);
      }
}
