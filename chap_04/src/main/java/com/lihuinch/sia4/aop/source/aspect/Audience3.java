package com.lihuinch.sia4.aop.source.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author lihuinch
 * @date 2019/7/3 22:47
 */
@Aspect
@Component
public class Audience3 {

    @Pointcut("execution(* com.lihuinch.sia4.aop.source.bean.Performance.perform(..))")
    public void perform() {

    }

    @Around("perform()")
    public void watchPerfomance(ProceedingJoinPoint jp) {
        try {

            System.out.println("Audience3 关闭手机");
            System.out.println("Audience3 坐下");
            jp.proceed();

            System.out.println("Audience3 鼓掌");
        } catch (Throwable throwable) {

            System.out.println("Audience3 退票");
        }
    }
}
