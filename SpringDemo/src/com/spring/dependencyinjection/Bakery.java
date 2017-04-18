package com.spring.dependencyinjection;

public class Bakery {

	private String bakeryName;
	
	private CookiesFactory cookiesFactory;
	
	public Bakery(CookiesFactory cookiesFactory){
		this.cookiesFactory = cookiesFactory;
	}

	public void getBakeryName() {
		System.out.println("Bakery name :"+ bakeryName); 
	}

	public void getCookiesFactory() {
		cookiesFactory.getCookeName();
		cookiesFactory.getCookePrice();
	}

	public void setBakeryName(String bakeryName) {
		this.bakeryName = bakeryName;
	}
	
}
