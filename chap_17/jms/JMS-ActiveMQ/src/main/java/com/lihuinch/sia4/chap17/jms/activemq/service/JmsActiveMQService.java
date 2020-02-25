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

    public void sendQueue1(final NbaPlayer value) {
        System.out.println();
        System.out.println("============ Queue1 ============");
        System.out.println();
        operations.convertAndSend(SomeConstants.JMS_ACTIVE_MQ_QUEUE1, value);
        System.out.println("send : " + value);
        System.out.println();
        System.out.println();
    }

    public NbaPlayer receiveQueue1() {
        System.out.println();
        System.out.println("============ receiveQueue1 ============");
        System.out.println();
        NbaPlayer resut = (NbaPlayer) operations.receiveAndConvert(SomeConstants.JMS_ACTIVE_MQ_QUEUE1);
        System.out.println("receive : " + resut);
        System.out.println();
        System.out.println();
        return resut;
    }

    /**
     * 参数receive是必要的, 还必须是java.lang.String
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
}
