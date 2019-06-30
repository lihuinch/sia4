package com.lihuinch.sia4.chap3.spel.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author lihuinch
 * @date 2019/6/30 17:48
 */
@Data
@Component
@PropertySource("classpath:external.properties")
public class SpelBean2 {

    // 基本类型可以接受
    @Value("#{3}")
    private int anInt;

    // 包装类型可以接受
    @Value("#{3}")
    private Integer anInteger;

    @Value("#{T(System).currentTimeMillis()}")
    private Long now;

    // 不能写入配置变量?
    @Value("#{systemProperties['externalBean.value']}")
    private String propertiesValue;

    @Value("#{spelBean}")
    private SpelBean spelBean;

    @Value("#{T(java.lang.Math).PI}")
    private double pi;

    private List<String> list = Arrays.asList("1", "2");

    @Value("#{spelBean2.list[0]}")
    private String listMem;
}
