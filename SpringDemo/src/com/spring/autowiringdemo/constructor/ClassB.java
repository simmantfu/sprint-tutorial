package com.spring.autowiringdemo.constructor;

public class ClassB {

	private ClassA classA;

	public ClassB(ClassA classA) {
		this.classA = classA;
	}

	public void getClassA() {
		classA.printMessage();
	}

}
