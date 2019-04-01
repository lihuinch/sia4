package com.lihuinch.sia4.profile.bean;

import lombok.Data;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * 实现BaseBean 在one环境生成的bean
 *
 * @author lihuinch
 * @date 2019/4/1 12:47
 */
@Data
// component两个value不能一样
// @Component("baseBean")
// @Component
// @Profile("one")
public class BaseBeanActiveOneImpl implements BaseBean {

    public void show() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "BaseBeanActiveOneImpl{}";
    }
}
