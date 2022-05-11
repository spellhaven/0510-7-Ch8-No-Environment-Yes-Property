package com.spellhaven.spring0510_7;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		AdminConnection adminconn1 = ctx.getBean("adminConn", AdminConnection.class);
		
		System.out.println(adminconn1.getAdminId());
		System.out.println(adminconn1.getAdminPw());
		System.out.println(adminconn1.getSub_adminId());
		System.out.println(adminconn1.getSub_adminPw());
		
		ctx.close();

	}

}
