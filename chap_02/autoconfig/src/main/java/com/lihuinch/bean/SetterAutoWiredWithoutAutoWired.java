package com.lihuinch.bean;

import org.springframework.stereotype.Component;

/**
 * setter注入不加@Autowired
 *
 * @author lihuinch
 * @date 2019/1/24 17:55
 */
@Component
public class SetterAutoWiredWithoutAutoWired {

    private AutoBean autoBean;

    // 不加@Autowired
    public void setAutoBean(AutoBean autoBean) {
        this.autoBean = autoBean;
    }

    public void show() {
        System.out.println("SetterAutoWiredNotOnAutoWired show()");
        autoBean.show();
    }
}
