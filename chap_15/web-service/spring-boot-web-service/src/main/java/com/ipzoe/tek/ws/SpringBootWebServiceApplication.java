package com.ipzoe.tek.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@ComponentScan(basePackages = "com.ipzoe.tek")
@Import(WebServiceConfig.class)
@SpringBootApplication
public class SpringBootWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebServiceApplication.class, args);
	}

}
