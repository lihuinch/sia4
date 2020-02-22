package com.lihuinch.sia4.chap15.spring.ws.client;

import com.lihuinch.sia4.chap15.spring.ws.client.service.QBWebConnectorSvcSoap;
import com.lihuinch.sia4.chap15.spring.ws.entity.ArrayOfString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class SpringWsClientApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private QBWebConnectorSvcSoap qbWebConnectorSvcSoap;

	@Test
	public  void test01() {
		ArrayOfString authenticate = qbWebConnectorSvcSoap.authenticate("username", "password");
		System.out.println(Arrays.toString(authenticate.getString()));


		String requestXML = qbWebConnectorSvcSoap.sendRequestXML("1", "2", "3", "4", 5, 6);
		System.out.println(requestXML);

	}

}
