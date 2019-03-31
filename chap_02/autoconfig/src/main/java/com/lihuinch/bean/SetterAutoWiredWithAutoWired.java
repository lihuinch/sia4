package com.lihuinch.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * setter注入，有@Autowired
 *
 * @author lihuinch
 * @date 2019/1/24 17:55
 */
@Component
public class SetterAutoWiredWithAutoWired {

    private AutoBean autoBean;

    @Autowired
    public void setAutoBean2(AutoBean autoBean) {
        this.autoBean = autoBean;
    }

    public void show() {
        System.out.println("SetterAutoWiredWithAutoWired show()");
        autoBean.show();
    }
}
