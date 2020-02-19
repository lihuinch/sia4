package com.lihuinch.sia4.chap15.spring.ws.client.config;

import com.lihuinch.sia4.chap15.spring.ws.client.service.QBWebConnectorSvcSoap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author lihuinch
 * @date 2020/2/20 3:00
 */
@Configuration
public class AppConfig {

    @Bean
    public JaxWsPortProxyFactoryBean QBWebConnectorSvcSoap() throws MalformedURLException {
        JaxWsPortProxyFactoryBean proxy = new JaxWsPortProxyFactoryBean();
        proxy.setWsdlDocumentUrl(new URL("http://localhost:8080/axis/services/QBWebConnectorSvcSoap?wsdl"));
        proxy.setServiceName("QBWebConnectorSvcSoap");
        proxy.setPortName("QBWebConnectorSvcSoapEndpointPort");
        proxy.setServiceInterface(QBWebConnectorSvcSoap.class);
        proxy.setNamespaceUri("http://developer.intuit.com/");
        return proxy;
    }
}
