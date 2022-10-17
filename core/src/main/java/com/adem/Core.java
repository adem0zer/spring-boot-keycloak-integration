package com.adem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.adem.*"})
public class Core {
    public static void main(String[] args) {
        SpringApplication.run(Core.class, args);
    }
}
