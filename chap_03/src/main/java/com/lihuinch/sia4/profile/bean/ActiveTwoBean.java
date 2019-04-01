package com.lihuinch.sia4.profile.bean;

import lombok.Data;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * 只在one环境生成的bean
 *
 * @author lihuinch
 * @date 2019/3/31 18:47
 */
@Data
@Component
@Profile("two")
public class ActiveTwoBean {
    static {
        System.out.println("ActiveTwoBean.init");
    }
}
