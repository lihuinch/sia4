package com.lihuinch.sia4.scope.bean;

import lombok.Data;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 单例（Singleton）：在整个应用中，只创建bean的一个实例。
 *
 * @author lihuinch
 * @date 2019/4/26 12:35
 */
@Data
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingletonBean {

    /**
     * 一个对象变量，如果是单例模式，那么count将在各个地方数值一致
     */
    private Integer value = 0;

}
