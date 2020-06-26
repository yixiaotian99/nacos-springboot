package com.xiao.nacos.discover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class NacosDiscoverApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoverApplication.class, args);
    }

}
