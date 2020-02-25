package com.lihuinch.sia4.chap17.jms.activemq.service;

import com.lihuinch.sia4.chap17.jms.activemq.constant.SomeConstants;
import com.lihuinch.sia4.chap17.jms.activemq.entity.NbaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsOperations;

/**
 * @author lihuinch
 * @date 2020/2/25 15:31
 */
public class JmsActiveMQService {

    private JmsOperations operations;

    @Autowired
    public JmsActiveMQService(JmsOperations operations) {
        this.operations = operations;
    }

    public void sendQueue1(NbaPlayer value) {
        System.out.println("============ sendQueue1 ============");
        sendQueue(SomeConstants.JMS_ACTIVE_MQ_QUEUE1, value);
        System.out.println();
    }

    public NbaPlayer receiveQueue1() {
        System.out.println("============ receiveQueue1 ============");
        NbaPlayer result = receiveQueue(SomeConstants.JMS_ACTIVE_MQ_QUEUE1);
        System.out.println();
        return result;
    }


    public void sendQueue2(NbaPlayer value) {
        System.out.println("============ sendQueue2 ============");
        sendQueue(SomeConstants.JMS_ACTIVE_MQ_QUEUE2, value);
        System.out.println();
    }

    public NbaPlayer receiveQueue2() {
        System.out.println("============ receiveQueue2 ============");
        NbaPlayer result = receiveQueue(SomeConstants.JMS_ACTIVE_MQ_QUEUE2);
        System.out.println();
        return result;
    }

    /**
     * 参数receive是必要的, 还必须是java.lang.String
     * todo 如何接受json后直接转化为实体
     *
     * @param receive
     */
    public void listenerQueue1(String receive) {
        System.out.println();
        System.out.println("============ listener ============");
        System.out.println();
        System.out.println("listener : " + receive);
        System.out.println();
        System.out.println();
    }

    private void sendQueue(String des, NbaPlayer value) {
        System.out.println();
        operations.convertAndSend(des, value);
        System.out.println("des : " + des + ", send : " + value);
        System.out.println();
    }

    private NbaPlayer receiveQueue(String des) {
        System.out.println();
        NbaPlayer result = (NbaPlayer) operations.receiveAndConvert(des);
        System.out.println("des : " + des + "receive : " + result);
        System.out.println();
        return result;
    }
}
