package com.lihuinch.sia4.chap15.spring.rmi.client;

import com.lihuinch.sia4.chap15.spring.rmi.entity.ArrayOfString;
import com.lihuinch.sia4.chap15.spring.rmi.client.service.QBWebConnectorSvcSoap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRmiClientApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private QBWebConnectorSvcSoap qbWebConnectorSvcSoap;

    @Test
    public void test01() {

        ArrayOfString authenticate = qbWebConnectorSvcSoap.authenticate("1", "1");
        System.out.println(authenticate);

    }

}
