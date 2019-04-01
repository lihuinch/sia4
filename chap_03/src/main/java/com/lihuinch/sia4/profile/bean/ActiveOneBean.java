package com.lihuinch.sia4.profile.bean;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author lihuinch
 * @date 2019/3/31 18:47
 */
@Component
@Profile("one")
public class ActiveOneBean {
    static {
        System.out.println("ActiveOneBean.init");
    }
}
