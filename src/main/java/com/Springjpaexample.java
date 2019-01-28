package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages = "com.repository")
@SpringBootApplication
public class Springjpaexample {
    public static void main(String[] args) {
        SpringApplication.run(Springjpaexample.class, args);
    }
}
