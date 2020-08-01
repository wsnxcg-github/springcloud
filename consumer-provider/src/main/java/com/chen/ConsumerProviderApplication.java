package com.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * 如果选用的注册中心是eureka，
 * 那么就推荐@EnableEurekaClient，
 * 如果是其他的注册中心，
 * 那么推荐使用@EnableDiscoveryClient。
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
//@EnableDiscoveryClient
public class ConsumerProviderApplication {

    public static void main(String[] args) {
        System.out.println("正在启动consumer-provider...");
        SpringApplication.run(ConsumerProviderApplication.class, args);
    }

}
