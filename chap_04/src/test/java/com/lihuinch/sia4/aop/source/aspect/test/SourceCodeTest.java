package com.lihuinch.sia4.aop.source.aspect.test;

import com.lihuinch.sia4.aop.source.aspect.TrackCounter;
import com.lihuinch.sia4.aop.source.bean.BlankDisc;
import com.lihuinch.sia4.aop.source.bean.Encoreable;
import com.lihuinch.sia4.aop.source.bean.Performance;
import com.lihuinch.sia4.aop.source.cofig.AutoConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;

/**
 * @author lihuinch
 * @date 2019/7/3 20:40
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AutoConfig.class)
public class SourceCodeTest {

    @Autowired
    private Performance performance;

    @Autowired
    private BlankDisc blankDisc;

    @Before
    public void before() {
        System.out.println("切面实验");
    }

    @Test
    public void test1() {
        performance.perform();
    }

    @Test
    public void test2() {
        blankDisc.play(1);
        blankDisc.play(2);
        blankDisc.play(2);
        blankDisc.play(2);
        blankDisc.play(3);
        blankDisc.play(3);
        blankDisc.play(3);
        blankDisc.play(3);
        blankDisc.play(3);
        blankDisc.play(3);
        blankDisc.play(3);
        blankDisc.play(3);

        for (Map.Entry<Integer, Integer> entry : TrackCounter.trackCounts.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println();
        for (Map.Entry<Integer, Integer> entry : TrackCounter.trackCounts2.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    @Test
    public void test3() {


        System.out.println("引入新方法");
        System.out.println("其实的意思是，对一个类实现一个新的接口");
        System.out.println("直接转型即可");
        System.out.println("你可以把当前对象转型成另一个对象，那么很显然，你就可以调用另一个对象的方法了");
        System.out.println("http://www.blogjava.net/jackfrued/archive/2010/02/27/314060.html");
        performance.perform();
        Encoreable encoreable = (Encoreable)performance;
        encoreable.performEncore();

    }
}
