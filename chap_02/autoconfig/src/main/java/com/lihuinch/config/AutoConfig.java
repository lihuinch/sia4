package com.lihuinch.config;

import com.lihuinch.bean.FieldAutowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lihuinch
 * @date 2019/1/24 8:57
 */
@Configuration
@ComponentScan(basePackageClasses = {FieldAutowired.class})
public class AutoConfig {
}
