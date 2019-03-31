package com.lihuinch.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 构造器注入，没有默认构造函数，有其他不加@Autowired的构造函数
 *
 * @author lihuinch
 * @date 2019/1/24 17:49
 */
@Component
public class ConstructorAutoWiredWithoutDefaultHasOther {

    private AutoBean autoBean;

    private String value;

    @Autowired
    public ConstructorAutoWiredWithoutDefaultHasOther(AutoBean autoBean) {
        System.out.println("构建 ConstructorAutoWiredWithoutDefaultHasOther 对象");
        System.out.println("@Autowired public ConstructorAutoWiredWithoutDefaultHasOther(AutoBean autoBean)");
        this.autoBean = autoBean;
        System.out.println();
    }

    // 其他不加@Autowired的构造函数
    public ConstructorAutoWiredWithoutDefaultHasOther(String value) {
        System.out.println("构建 ConstructorAutoWiredWithoutDefaultHasOther 对象");
        System.out.println("public ConstructorAutoWiredWithoutDefaultHasOther(String value)");
        this.value = value;
        System.out.println();
    }

    public void show() {
        System.out.println("ConstructAutoWired show()");
        System.out.println("ConstructorAutoWiredWithoutDefaultHasOther.value = " + value);
        autoBean.show();
    }
}
