package com.lihuinch.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 构造器注入，没有默认构造器
 *
 * @author lihuinch
 * @date 2019/1/24 17:49
 */
@Component
public class ConstructorAutoWiredWithoutDefault {

    private AutoBean autoBean;

    // @Autowired 可以不加
    public ConstructorAutoWiredWithoutDefault(AutoBean autoBean) {
        System.out.println("构建 ConstructorAutoWiredWithoutDefault 对象");
        System.out.println("public ConstructorAutoWiredWithoutDefault(AutoBean autoBean)");
        this.autoBean = autoBean;
        System.out.println();
    }

    public void show() {
        System.out.println("ConstructAutoWired show()");
        autoBean.show();
    }
}
