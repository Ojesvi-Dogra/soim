package com.example.soim;

import org.springframework.boot.SpringApplication;

public class TestSoimApplication {

    public static void main(String[] args) {
        SpringApplication.from(SoimApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
