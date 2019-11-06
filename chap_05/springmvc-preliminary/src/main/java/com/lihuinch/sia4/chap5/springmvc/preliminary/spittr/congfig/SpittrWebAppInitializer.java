package com.lihuinch.sia4.chap5.springmvc.preliminary.spittr.congfig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

/**
 * @author lihuinch
 * @date 2019/7/9 23:15
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("SpittrWebAppInitializer.getRootConfigClasses");
        return new Class[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("SpittrWebAppInitializer.getServletConfigClasses");
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("SpittrWebAppInitializer.getServletMappings");
        return new String[]{"/"};
    }

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        registration.setMultipartConfig(
                new MultipartConfigElement(
                        "/temp/spittr/uploads",
                        2096152,
                        4194304,
                        0
                )
        );
    }
}
