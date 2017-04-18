package com.spring.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/spring/dependencyinjection/Bean.xml");
		Bakery bakery = (Bakery) applicationContext.getBean("bakery");

		bakery.getBakeryName();
		bakery.getCookiesFactory();
	}

}
