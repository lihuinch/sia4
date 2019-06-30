package com.lihuinch.sia4.chap3.external.config;

import com.lihuinch.sia4.chap3.external.bean.ExternalBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * @author lihuinch
 * @date 2019/5/7 12:42
 */
@Configuration
@PropertySource("classpath:external.properties")
public class ExternalJavaConfig {

    private final Environment environment;

    @Value("${externalBean.value}")
    private String externalBeanValue;

    @Autowired
    public ExternalJavaConfig(Environment environment) {
        this.environment = environment;
    }

    /**
     * 为了使用占位符，我们必须要配置一个PropertyPlaceholderConfigurer bean
     * 或PropertySourcesPlaceholderConfigurer bean。从Spring 3.1开始，推荐使
     * 用PropertySourcesPlaceholderConfigurer，因为它能够基于Spring Environment
     * 及其属性源来解析占位符。
     * <p>
     * 目前看来 貌似并不需要
     * <p>
     * todo 必须是static ？？？？
     */
    @Bean
    public

    static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public ExternalBean externalBean() {
        return new ExternalBean(environment.getProperty("externalBean.value"));
    }

    @Bean(name = "externalBeanWithValue")
    public ExternalBean externalBeanWithValue() {
        System.out.println("使用@Value获得属性");
        System.out.println("@Value(\"${externalBean.value}\") private String externalBeanValue = " + externalBeanValue);

        return new ExternalBean(externalBeanValue);
    }

   // @Bean(name = "externalBeanWithGetPropertyAsClass")
    public ExternalBean getPropertyAsClass() throws IllegalAccessException, InstantiationException {
        Class<ExternalBean> externalBean = environment.getPropertyAsClass("externalBean", ExternalBean.class);

        System.out.println("已过时，不做test");
        return externalBean.newInstance();
    }
}
