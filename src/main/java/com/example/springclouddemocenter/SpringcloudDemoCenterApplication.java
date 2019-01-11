package com.example.springclouddemocenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudDemoCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudDemoCenterApplication.class, args);
    }

}

