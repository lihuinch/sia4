package com.lihuinch.sia4.chap20.jmx.mbean;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

/**
 * @author lihuinch
 * @date 2020/3/21 20:59
 */
@Component
@ManagedResource(objectName = "test:name=TestSpringMBean")
public class TestSpringMBean {

    private Integer number = 10;

    @ManagedAttribute
    public Integer getNumber() {
        return number;
    }

    @ManagedAttribute
    public TestSpringMBean setNumber(Integer number) {
        this.number = number;
        return this;
    }
}
