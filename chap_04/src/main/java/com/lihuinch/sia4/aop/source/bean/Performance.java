package com.lihuinch.sia4.aop.source.bean;

import org.springframework.stereotype.Component;

/**
 * @author lihuinch
 * @date 2019/7/3 20:01
 */
@Component
public class Performance {

    public void perform() {
        System.out.println("perform()");
    }
}
