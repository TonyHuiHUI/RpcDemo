package com.hui.feign.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author hui
 * 2021/8/9 0009 17:06
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class HelloServiceTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloServiceTestApplication.class, args);
    }
}
