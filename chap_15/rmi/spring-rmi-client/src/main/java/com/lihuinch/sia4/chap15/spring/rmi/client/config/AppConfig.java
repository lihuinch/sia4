package com.lihuinch.sia4.chap15.spring.rmi.client.config;

import com.lihuinch.sia4.chap15.spring.rmi.client.service.QBWebConnectorSvcSoap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

/**
 * @author lihuinch
 * @date 2020/2/19 21:19
 */
@Configuration
public class AppConfig {

    @Bean
    public RmiProxyFactoryBean spitterService() {
        RmiProxyFactoryBean rmiProxy = new RmiProxyFactoryBean();
        rmiProxy.setServiceUrl("rmi://localhost:1099/QBWebConnectorSvcSoap");
        rmiProxy.setServiceInterface(QBWebConnectorSvcSoap.class);
        return rmiProxy;
    }
}