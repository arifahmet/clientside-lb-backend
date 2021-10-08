package com.arif.lb.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LbBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(LbBackendApplication.class, args);
    }

}
