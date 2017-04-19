package com.spring.autowiringdemo.bytype;

public class ClassB {

	private ClassA classA;

	
	public void setClassA(ClassA classA) {
		this.classA = classA;
	}


	public void getClassA(){
		classA.printMessage();
	}
	
}
