package com.solomka.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Homework20EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Homework20EurekaServerApplication.class, args);
    }

}
