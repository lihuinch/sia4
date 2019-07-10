package com.lihuinch.sia4.chap5.springmvc.preliminary.spittr.congfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author lihuinch
 * @date 2019/7/9 23:26
 */
@Configuration
@ComponentScan(basePackages = "com.lihuinch.sia4.chap5.springmvc.preliminary.spittr",
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)
        }
)
public class RootConfig {
}
