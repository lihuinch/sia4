package com.lihuinch.sia4.chap15.spring.ws.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

/**
 * @author lihuinch
 * @date 2020/2/20 0:25
 */
@Configuration
public class AppConfig {
    @Bean
    public SimpleJaxWsServiceExporter jaxWsExporter() {
        System.out.println("=========================== jaxWsExporter ==============================");

        SimpleJaxWsServiceExporter exporter = new SimpleJaxWsServiceExporter();
        exporter.setBaseAddress("http://localhost:8080/axis/services/");


        return exporter;
    }
}
