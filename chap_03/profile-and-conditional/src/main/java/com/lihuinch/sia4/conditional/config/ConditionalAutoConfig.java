package com.lihuinch.sia4.conditional.config;

import com.lihuinch.sia4.conditional.bean.ConditionalBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lihuinch
 * @date 2019/4/1 21:40
 */
// 实际上，一开始没加上Configuration注解也能使用
@Configuration
@ComponentScan(basePackageClasses = ConditionalBean.class)
public class ConditionalAutoConfig {
}
