package com.kzykzy.kzykzy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories

public class KzykzyApplication {
    public static void main(String[] args) {
        SpringApplication.run(KzykzyApplication.class, args);
    }

}
