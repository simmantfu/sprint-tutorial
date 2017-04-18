package com.spring.lifecycledemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/spring/lifecycledemo/Bean.xml");
		Logout logout = (Logout) applicationContext.getBean("logout");
		System.out.println(logout.getMessage());
		applicationContext.registerShutdownHook();
	}

}
