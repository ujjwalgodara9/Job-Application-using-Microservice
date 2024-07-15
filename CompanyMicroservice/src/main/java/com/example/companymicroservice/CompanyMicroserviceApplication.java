package com.example.companymicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CompanyMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompanyMicroserviceApplication.class, args);
    }

}
