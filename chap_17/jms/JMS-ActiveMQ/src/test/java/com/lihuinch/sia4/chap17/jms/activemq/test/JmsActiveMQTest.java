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


    @Test
    public void sendQueue01() {
        mqService.sendQueue1(NbaPlayer.kobe());
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


    @Test
    public void Q2发多条消息一次性循环接受() {
        int n = 5;
        try {
            Q2发n条消息的实验(n);

            int temp = n;
            System.out.println("开始循环接受");
            while (n > 0) {
                n--;

                System.out.println("第" + (temp - n) + "次接受");

                mqService.receiveQueue2();
                TimeUnit.SECONDS.sleep(1);
            }

            System.out.println("接下来接受就是阻塞了.............");
            mqService.receiveQueue2();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void STEP_1_Q2发多条消息() {
        int n = 5;
        System.out.println("STEP_1 : 向Q2发" + n + "条消息");
        System.out.println("STEP_2 : 每次启动任务只调用接受一次receive,看是不是" + n + "次启动接收完成, 之后就阻塞了, 注意取顺序和放入顺序");

        Q2发n条消息的实验(n);

        System.out.println("运行 STEP_2_Q2每次启动只接受一条看是不是正好n次启动接收完成");

    }

    @Test
    public void STEP_2_Q2每次启动只接受一条看是不是正好n次启动接收完成() {
        System.out.println("STEP_2 : 每次启动任务只调用接受一次receive,看是不是n次启动接收完成, 之后就阻塞了, 注意取顺序和放入顺序");
        mqService.receiveQueue2();
        System.out.println("确实是按照放入的方式被取出,且正好n次");
    }


    private void Q2发n条消息的实验(int n) {
        try {
            int temp = n;
            System.out.println("向 JMS_ACTIVE_MQ_QUEUE2 发送" + n + "条msg 开始");

            while (n > 0) {
                n--;
                System.out.println("第" + (temp - n) + "次发送");

                mqService.sendQueue2(NbaPlayer.kobe());
                TimeUnit.SECONDS.sleep(1);

            }
            System.out.println("向 JMS_ACTIVE_MQ_QUEUE2 发送" + (temp - n) + "条msg 完成");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}