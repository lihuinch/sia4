# JMS
> JMSActiveMQ.

## TIPS
1.XML引用引用常量类

    1. 加入
     xmlns:util="http://www.springframework.org/schema/util"
      http://www.springframework.org/schema/util http://www.springframework.org/schema/util/spring-util-4.3.xsd
    
    2. <util:constant id="JMS_ACTIVE_MQ_QUEUE1"
               static-field="JMS_ACTIVE_MQ_QUEUE1
    3. <xxx="#{JMS_ACTIVE_MQ_QUEUE1}">

2.jms:listener中注册的方法必须是参数为String