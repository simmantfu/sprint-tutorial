package com.spring.scopedemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		register();

	}

	// for singletone 
	private static void login(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/scopedemo/Bean1.xml");
		Login login = (Login) applicationContext.getBean("login");
		login.setUserName("user");
		login.setPassword("password");
		System.out.println("username is : " + login.getUserName() + " password is : " + login.getPassword());

		Login login2 = (Login) applicationContext.getBean("login");
		System.out.println("username is : " + login2.getUserName() + " password is : " + login2.getPassword());
	}
	
	// for prototype 
	private static void register(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/scopedemo/Bean1.xml");
		Registration registration =  (Registration) applicationContext.getBean("register");	
		registration.setFirstName("simmant");
		registration.setLastName("yadav");
		registration.setUserName("sim");
		registration.setPassword("1234567");
		
		System.out.println("firstname : "+registration.getFirstName()+" lastname : "+registration.getLastName()+" username : "+registration.getUserName()+" password : "+registration.getPassword());
		
		Registration registration2 =  (Registration) applicationContext.getBean("register");
		System.out.println("firstname : "+registration2.getFirstName()+" lastname : "+registration2.getLastName()+" username : "+registration2.getUserName()+" password : "+registration2.getPassword());
	}
}
