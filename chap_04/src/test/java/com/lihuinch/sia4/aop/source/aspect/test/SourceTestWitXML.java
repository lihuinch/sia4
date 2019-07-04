package com.lihuinch.sia4.aop.source.aspect.test;

import com.lihuinch.sia4.aop.source.aspect.TrackCounter;
import com.lihuinch.sia4.aop.source.bean.BlankDisc;
import com.lihuinch.sia4.aop.source.bean.Performance;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;

/**
 * @author lihuinch
 * @date 2019/7/4 21:37
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:aop.xml")
public class SourceTestWitXML {

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
}
