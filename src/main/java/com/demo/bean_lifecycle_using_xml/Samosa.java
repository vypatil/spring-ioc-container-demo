package com.demo.bean_lifecycle_using_xml;

public class Samosa {
	
	double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Samosa(double price) {
		super();
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	
	public void init() {
		
		System.out.println("inside init method");
	}
	public void destroy() {
		
		System.out.println("inside destroy method");
	}
	
	

}
