package com.lihuinch.sia4.chap15.spring.ws.client;

import com.lihuinch.sia4.chap15.spring.ws.client.service.QBWebConnectorSvcSoap;
import com.lihuinch.sia4.chap15.spring.ws.entity.ArrayOfString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringWsClientApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private QBWebConnectorSvcSoap qbWebConnectorSvcSoap;

	@Test
	public  void test01() {
		ArrayOfString authenticate = qbWebConnectorSvcSoap.authenticate("1", "1");
		System.out.println(authenticate);
	}

}
