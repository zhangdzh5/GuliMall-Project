package com.yan.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = "com.yan.gulimall.member.feign")
public class GulimallMeberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMeberApplication.class, args);
    }

}
