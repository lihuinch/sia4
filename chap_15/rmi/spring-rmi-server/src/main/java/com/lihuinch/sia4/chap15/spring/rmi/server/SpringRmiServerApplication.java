package com.lihuinch.sia4.chap15.spring.rmi.server;

import com.lihuinch.sia4.chap15.spring.rmi.server.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan(basePackages = "com.lihuinch.sia4.chap15.spring.rmi.server")
@Import(value = {AppConfig.class})
public class SpringRmiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRmiServerApplication.class, args);
	}

}
