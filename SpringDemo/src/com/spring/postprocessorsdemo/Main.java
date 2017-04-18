package com.spring.postprocessorsdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/spring/postprocessorsdemo/Bean.xml");
		MainPanel mainPanel = (MainPanel) applicationContext.getBean("mainPanel");
		System.out.println(mainPanel.getDisplayName());
		applicationContext.registerShutdownHook();
	}

}
