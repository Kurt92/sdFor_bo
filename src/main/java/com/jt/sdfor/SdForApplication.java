package com.jt.sdfor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.jt.sdfor")
@EnableJpaRepositories(basePackages = "com.jt.sdfor")
public class SdForApplication {

    public static void main(String[] args) {
        SpringApplication.run(SdForApplication.class, args);
    }

}
