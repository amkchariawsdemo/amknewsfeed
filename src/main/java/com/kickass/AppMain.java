package com.kickass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.kickass.controller"
} )
public class AppMain {

    public static void main(final String[] args) {
        SpringApplication.run(AppMain.class, args);
    }
}
