package com.spring.definitioninheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/definitioninheritance/Bean.xml");
		University university = (University) applicationContext.getBean("university");
		System.out.println("Course name : "+university.getCourseName());
		System.out.println("Course fee : "+university.getCourseFees());
		
		ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("com/spring/definitioninheritance/Bean.xml");
		College college = (College) applicationContext2.getBean("college");
		System.out.println("Teacher name : "+college.getTeachersName());
		System.out.println("Student name : "+college.getStudentName());
		
	}

}
