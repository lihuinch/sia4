package com.lihuinch.sia4.aop.source.bean;

/**
 * @author lihuinch
 * @date 2019/7/4 19:43
 */
public class DefaultEncoreable implements Encoreable {
    @Override
    public void performEncore() {
        System.out.println("返场演出");
    }
}
