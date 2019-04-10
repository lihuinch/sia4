package com.lihuinch.sia4.config;

import com.lihuinch.sia4.bean.BaseInterface;
import org.springframework.context.annotation.ComponentScan;

/**
 * 自动配置
 *
 * @author lihuinch
 * @date 2019/4/10 7:30
 */
// @Configuration 可以不加
@ComponentScan(basePackageClasses = BaseInterface.class) // 不在同一个包下，必须指定扫描哪一个包
public class Autoconfig {
}
