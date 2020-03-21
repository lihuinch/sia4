package com.lihuinch.sia4.chap20.jmx;

import com.lihuinch.sia4.chap20.jmx.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*
         * 放到tomcate下就是不行,不知道为什么
         * 放到tomcate下就是不行,不知道为什么
         * 放到tomcate下就是不行,不知道为什么
         * 放到tomcate下就是不行,不知道为什么
         * 放到tomcate下就是不行,不知道为什么
         * 放到tomcate下就是不行,不知道为什么
         * 放到tomcate下就是不行,不知道为什么
         */
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Thread.sleep(600000000);
    }
}
