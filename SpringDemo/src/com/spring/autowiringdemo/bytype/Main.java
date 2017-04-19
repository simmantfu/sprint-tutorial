package com.spring.autowiringdemo.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String... ar){
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/autowiringdemo/bytype/Bean.xml");
		ClassB b = (ClassB) applicationContext.getBean("classB");
	    b.getClassA(); 
	}
	
}
