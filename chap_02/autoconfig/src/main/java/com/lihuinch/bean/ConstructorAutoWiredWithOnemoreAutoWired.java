package com.lihuinch.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 构造器注入，有多个@Autowired的构造方法 ： 只能有一个@Autowired
 *
 * @author lihuinch
 * @date 2019/1/24 17:49
 */
@Component
public class ConstructorAutoWiredWithOnemoreAutoWired {

    private AutoBean autoBean;

    private String value;

    // 有默认构造方法
    public ConstructorAutoWiredWithOnemoreAutoWired() {
    }

    @Autowired
    public ConstructorAutoWiredWithOnemoreAutoWired(AutoBean autoBean) {
        System.out.println("构建ConstructorAutoWiredWithDefault对象");
        System.out.println("@Autowired public ConstructorAutoWiredWithDefault(AutoBean autoBean)");
        this.autoBean = autoBean;

        System.out.println();
    }
    /* 只能有一个，编译报错
    @Autowired
    public ConstructorAutoWiredWithOnemoreAutoWired(AutoBean autoBean, String value) {
        this.autoBean = autoBean;
        this.value = value;
    }

    @Autowired
    public ConstructorAutoWiredWithOnemoreAutoWired(String value) {
        this.value = value;
    }
    */

    public void show() {
        System.out.println("ConstructorAutoWiredWithDefault show()");
        autoBean.show();
    }
}
