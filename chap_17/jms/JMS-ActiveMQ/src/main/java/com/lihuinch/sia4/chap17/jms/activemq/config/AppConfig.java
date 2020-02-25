package com.lihuinch.sia4.chap17.jms.activemq.config;

import com.lihuinch.sia4.chap17.jms.activemq.constant.SomeConstants;
import com.lihuinch.sia4.chap17.jms.activemq.entity.NbaPlayer;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageType;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lihuinch
 * @date 2020/2/25 15:24
 */
@ComponentScan("com.lihuinch.sia4.chap17.jms.activemq")
@Configuration
@ImportResource("classpath:jms-activemq.xml")
public class AppConfig {

    @Bean("connectionFactory")
    public ActiveMQConnectionFactory connectionFactory() {
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();
        activeMQConnectionFactory.setBrokerURL("tcp://localhost:61616");

        return activeMQConnectionFactory;
    }

    @Bean
    public JmsTemplate jmsTemplate() {
        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        converter.setTargetType(MessageType.TEXT);
        // 定义了typeId到Class的Map
        Map<String, Class<?>> typeIdMap = new HashMap<>();
        typeIdMap.put("NbaPlayer", NbaPlayer.class);
        converter.setTypeIdMappings(typeIdMap);

        // 设置发送到队列中的typeId的名称
        converter.setTypeIdPropertyName("NbaPlayer");
        converter.setEncoding("UTF-8");

        JmsTemplate template = new JmsTemplate(connectionFactory());
        template.setMessageConverter(converter);

        return template;
    }

    @Bean(SomeConstants.JMS_ACTIVE_MQ_QUEUE1)
    public ActiveMQQueue queue1() {
        return new ActiveMQQueue(SomeConstants.JMS_ACTIVE_MQ_QUEUE1);
    }

    @Bean(SomeConstants.JMS_ACTIVE_MQ_QUEUE2)
    public ActiveMQQueue queue2() {
        return new ActiveMQQueue(SomeConstants.JMS_ACTIVE_MQ_QUEUE2);
    }


}
