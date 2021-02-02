package com.rest.msvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.rest.dao", "com.rest.msvc"})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}