package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		HelloSpring helloSpring =(HelloSpring) context.getBean("helloWorld");
		helloSpring.getMessage();
	}

}
