package com.lihuinch.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author lihuinch
 * @date 2019/1/24 8:36
 */
@Component
@Data
public class AutoBean {

    private String value = "AutoBeanStringValue";

    public void show() {
        System.out.println("AutoBean.show() ");
        System.out.println("AutoBean.value" + value);
    }
}
