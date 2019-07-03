package com.lihuinch.sia4.aop.source.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author lihuinch
 * @date 2019/7/3 20:13
 */
// 必须将这个纳为bean管理
@Component
@Aspect
public class Audience2 {

    @Pointcut("execution(* com.lihuinch.sia4.aop.source.bean.Performance.perform(..))")
    public void perform() {

    }

    @Before("perform()")
    public void silenceCellPhones() {
        System.out.println("Audience2 关闭手机");
    }

    @Before("perform()")
    public void takeSeats() {
        System.out.println("Audience2 坐下");
    }

    @AfterReturning("perform()")
    public void applause() {
        System.out.println("Audience2 鼓掌");
    }

    @AfterThrowing("perform()")
    public void demandRefund() {
        System.out.println("Audience2 退款");
    }
}
