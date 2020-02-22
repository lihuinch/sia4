package com.lihuinch.sia4.chap15.spring.ws.server;

import com.lihuinch.sia4.chap15.spring.ws.server.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan(basePackages = "com.lihuinch.sia4.chap15.spring.ws")
@Import({AppConfig.class})
public class SpringWsServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWsServerApplication.class, args);
    }

}
