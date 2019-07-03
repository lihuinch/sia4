package com.lihuinch.sia4.aop.source.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author lihuinch
 * @date 2019/7/3 20:13
 */
// 必须将这个纳为bean管理
@Component
@Aspect
public class Audience1 {

    @Before("execution(* com.lihuinch.sia4.aop.source.bean.Performance.perform(..))")
    public void silenceCellPhones() {
        System.out.println("Audience1 关闭手机");
    }

    @Before("execution(* com.lihuinch.sia4.aop.source.bean.Performance.perform(..))")
    public void takeSeats() {
        System.out.println("Audience1 坐下");
    }

    @AfterReturning("execution(* com.lihuinch.sia4.aop.source.bean.Performance.perform(..))")
    public void applause() {
        System.out.println("Audience1 鼓掌");
    }

    @AfterThrowing("execution(* com.lihuinch.sia4.aop.source.bean.Performance.perform(..))")
    public void demandRefund() {
        System.out.println("Audience1 退款");
    }
}
