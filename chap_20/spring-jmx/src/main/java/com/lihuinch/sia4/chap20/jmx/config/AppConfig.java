package com.lihuinch.sia4.chap20.jmx.config;

import org.springframework.context.annotation.*;
import org.springframework.jmx.support.MBeanServerFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author lihuinch
 * @date 2020/3/21 20:59
 */
@Configuration
@EnableMBeanExport
@ComponentScan("com.lihuinch.*")
public class AppConfig {
    @Bean(value = "server")
    public MBeanServerFactoryBean mBeanServerFactoryBean() {
        return new MBeanServerFactoryBean();
    }

}
