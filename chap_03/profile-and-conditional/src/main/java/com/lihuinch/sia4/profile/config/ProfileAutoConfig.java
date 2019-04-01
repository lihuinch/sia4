package com.lihuinch.sia4.profile.config;

import com.lihuinch.sia4.profile.bean.ProfileBean;
import org.springframework.context.annotation.ComponentScan;

/**
 * 关于profile实验的自动扫描config
 *
 * @author lihuinch
 * @date 2019/3/31 18:53
 */
@ComponentScan(basePackageClasses = ProfileBean.class)
public class ProfileAutoConfig {

}
