package com.lihuinch.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 属性注入
 *
 * @author lihuinch
 * @date 2019/1/24 8:36
 */
@Component
@Data
public class FieldAutowired {

    private String value = "FieldAutowiredStringValue";

    @Autowired
    private AutoBean autoBean;

    public void show() {
        System.out.println("FieldAutowired.show() ");
        System.out.println("FieldAutowired.value = " + value);
        autoBean.show();
    }


}
