package com.lihuinch.sia4.scope.bean;

import lombok.Data;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

/**
 * 会话作用域 没有上级结构的说法
 *
 * @author lihuinch
 * @date 2019/5/6 12:54
 */
@Data
@Component
@Scope(
        value = WebApplicationContext.SCOPE_SESSION,
        proxyMode = ScopedProxyMode.TARGET_CLASS
)
public class SessionBeanWithOutFather {

    public SessionBeanWithOutFather() {
        System.out.println();
        System.out.println("=================================================");
        System.out.println("默认构造器创建" + this.getClass().getSimpleName());
        System.out.println("=================================================");
        System.out.println();
    }
}
