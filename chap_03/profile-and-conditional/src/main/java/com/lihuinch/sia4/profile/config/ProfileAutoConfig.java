package com.lihuinch.sia4.profile.config;

import com.lihuinch.sia4.profile.bean.ProfileBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 关于profile实验的自动扫描config
 *
 * @author lihuinch
 * @date 2019/3/31 18:53
 */
// 实际上，一开始没加上Configuration注解也能使用
@Configuration
@ComponentScan(basePackageClasses = ProfileBean.class)
public class ProfileAutoConfig {

}
