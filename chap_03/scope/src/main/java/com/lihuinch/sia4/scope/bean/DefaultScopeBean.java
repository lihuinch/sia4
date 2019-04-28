package com.lihuinch.sia4.scope.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 测试一下默认的作用域 单例的
 *
 * =================== 是单例的 ===================
 *
 * @author lihuinch
 * @date 2019/4/28 12:37
 */
@Data
@Component
public class DefaultScopeBean {

    /**
     * 一个对象变量，如果是单例模式，那么count将在各个地方数值一致
     */
    private Integer value = 0;

    public DefaultScopeBean() {
        System.out.println();
        System.out.println("=================================================");
        System.out.println("默认构造器创建" + this.getClass().getSimpleName());
        System.out.println("=================================================");
        System.out.println();
    }
}
