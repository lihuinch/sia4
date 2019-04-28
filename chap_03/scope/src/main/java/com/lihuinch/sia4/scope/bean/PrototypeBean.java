package com.lihuinch.sia4.scope.bean;

import lombok.Data;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 原型（Prototype）：每次注入或者通过Spring应用上下文获取的时候，都会创建一个新的bean实例。
 *
 * @author lihuinch
 * @date 2019/4/28 12:47
 */
@Data
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean {

    /**
     * 一个对象变量，如果是单例模式，那么count将在各个地方数值一致
     */
    private Integer value = 0;

    public PrototypeBean() {
        System.out.println();
        System.out.println("=================================================");
        System.out.println("默认构造器创建" + this.getClass().getSimpleName());
        System.out.println("=================================================");
        System.out.println();
    }
}
