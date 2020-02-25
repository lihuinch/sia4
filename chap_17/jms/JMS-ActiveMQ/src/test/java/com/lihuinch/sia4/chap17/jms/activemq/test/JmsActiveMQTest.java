package com.lihuinch.sia4.chap17.jms.activemq.test;

import com.lihuinch.sia4.chap17.jms.activemq.config.AppConfig;
import com.lihuinch.sia4.chap17.jms.activemq.entity.NbaPlayer;
import com.lihuinch.sia4.chap17.jms.activemq.service.JmsActiveMQService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.TimeUnit;

/**
 * @author lihuinch
 * @date 2020/2/25 19:26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class JmsActiveMQTest {

    @Autowired
    private JmsActiveMQService mqService;

    NbaPlayer kobe = new NbaPlayer(24, "kobe", "lakers");

    @Test
    public void sendQueue01() {
        mqService.sendQueue1(kobe);
        /* 发送的时候就接受了
        try {
            Thread.yield();
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }

    @Test
    public void receiveQueue1() {
        NbaPlayer receive = mqService.receiveQueue1();
        System.out.println();
        System.out.println();
        System.out.println(receive);
        System.out.println();
        System.out.println();
    }

    @Test
    public void runListenerQueue1() {
        try {
            Thread.yield();
            TimeUnit.SECONDS.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
