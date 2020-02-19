package com.lihuinch.sia4.chap15.spring.rmi.server.config;

import com.lihuinch.sia4.chap15.spring.rmi.server.service.QBWebConnectorSvcSoap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

/**
 * @author lihuinch
 * @date 2020/2/19 21:19
 */
@Configuration
public class AppConfig {
    /**
     * 使用RmiServiceExporter 将SpitterServiceImpl发布为RMI服务
     * 默认情况下RmiServiceExport 会尝试绑定到本地机器 1099 端口上的RMI注册表
     * 这就是使用Spring 把某个bean转变成RMI服务所需要做的全部工作
     *
     * @param qbWebConnectorSvcSoap
     * @return
     */
    @Bean
    public RmiServiceExporter rmiExporter(QBWebConnectorSvcSoap qbWebConnectorSvcSoap) {
        System.out.println("=============================== AppConfig - rmiExporter =======================================");
        String simpleName = QBWebConnectorSvcSoap.class.getSimpleName();
        System.out.println("web service name = " + simpleName);

        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setServiceInterface(QBWebConnectorSvcSoap.class);
        rmiServiceExporter.setService(qbWebConnectorSvcSoap);
        rmiServiceExporter.setServiceName(simpleName);
        // rmiServiceExporter.setRegistryPort(1199);
        return rmiServiceExporter;
    }
}