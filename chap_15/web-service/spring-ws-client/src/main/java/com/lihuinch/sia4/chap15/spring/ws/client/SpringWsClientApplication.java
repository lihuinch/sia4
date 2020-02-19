package com.lihuinch.sia4.chap15.spring.ws.client;

import com.lihuinch.sia4.chap15.spring.ws.client.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({AppConfig.class})
@ComponentScan(basePackages = "com.lihuinch.sia4.chap15.spring.ws")
public class SpringWsClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWsClientApplication.class, args);
    }

}
