package com.lihuinch.sia4.scope.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 包含session bean的bean
 *
 * @author lihuinch
 * @date 2019/5/6 13:10
 */
@Data
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class WithSessionBean {

    @Autowired
    private SessionBeanWithOutFather sessionBeanWithOutFather;
}
