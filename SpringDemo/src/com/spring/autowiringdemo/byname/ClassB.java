package com.spring.autowiringdemo.byname;

public class ClassB {

	private ClassA classA;

	
	public void setClassA(ClassA classA) {
		this.classA = classA;
	}


	public void getClassA(){
		classA.printMessage();
	}
	
}
