package com.lihuinch.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 构造器注入，有默认构造方法
 *
 * @author lihuinch
 * @date 2019/1/24 17:49
 */
@Component
public class ConstructorAutoWiredWithDefault {

    private AutoBean autoBean;

    // 有默认构造方法
    public ConstructorAutoWiredWithDefault() {
    }

    @Autowired // 必须加
    public ConstructorAutoWiredWithDefault(AutoBean autoBean) {
        System.out.println("构建ConstructorAutoWiredWithDefault对象");
        System.out.println("@Autowired public ConstructorAutoWiredWithDefault(AutoBean autoBean)");
        this.autoBean = autoBean;

        System.out.println();
    }

    public void show() {
        System.out.println("ConstructorAutoWiredWithDefault show()");
        autoBean.show();
    }
}
