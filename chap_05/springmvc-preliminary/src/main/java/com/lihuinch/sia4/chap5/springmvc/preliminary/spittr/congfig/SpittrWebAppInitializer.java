package com.lihuinch.sia4.chap5.springmvc.preliminary.spittr.congfig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

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
}
