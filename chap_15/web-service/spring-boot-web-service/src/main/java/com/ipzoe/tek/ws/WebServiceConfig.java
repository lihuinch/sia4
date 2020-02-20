package com.ipzoe.tek.ws;


import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

/**
 * @author lihuinch
 * @date 2020/2/19 12:06
 */
@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/axis/services/*");
    }

    @Bean(name = "QBWebConnectorSvc")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema qbSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("QBWebConnectorSvcSoap");
        wsdl11Definition.setServiceName("QBWebConnectorSvc");
        wsdl11Definition.setLocationUri("/axis/services");
        wsdl11Definition.setTargetNamespace("http://developer.intuit.com/");
        wsdl11Definition.setSchema(qbSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema qbSchema() {
        return new SimpleXsdSchema(new ClassPathResource("qb.xsd"));
    }
}