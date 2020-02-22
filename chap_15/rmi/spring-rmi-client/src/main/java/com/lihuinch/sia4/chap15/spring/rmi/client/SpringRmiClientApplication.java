package com.lihuinch.sia4.chap15.spring.rmi.client;

import com.lihuinch.sia4.chap15.spring.rmi.client.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan(basePackages = "com.lihuinch.sia4.chap15.spring.rmi.client")
@Import(value = {AppConfig.class})
public class SpringRmiClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRmiClientApplication.class, args);
    }

}
