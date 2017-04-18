package com.spring.dependencyinjection;

public class CookiesFactory {

	private String cookeName;
	private String cookePrice;
	
	public CookiesFactory() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside Cookies Constructor");
	}
	
	public void getCookeName() {
		System.out.println("Cooke Name : "+cookeName); 
	}
	public void setCookeName(String cookeName) {
		this.cookeName = cookeName;
	}
	public void getCookePrice() {
		System.out.println("Cooke Price : "+cookePrice);
	}
	public void setCookePrice(String cookePrice) {
		this.cookePrice = cookePrice;
	}
	
}
