package com.ibm.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@EnableDiscoveryClient
//@EnableHystrix
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
