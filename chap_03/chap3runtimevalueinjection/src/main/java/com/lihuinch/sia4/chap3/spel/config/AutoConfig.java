package com.lihuinch.sia4.chap3.spel.config;

import com.lihuinch.sia4.chap3.spel.bean.SpelBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lihuinch
 * @date 2019/6/30 17:49
 */
@Configuration
@ComponentScan(basePackageClasses = SpelBean.class)
public class AutoConfig {
}
