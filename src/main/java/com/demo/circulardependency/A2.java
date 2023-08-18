package com.demo.circulardependency;

public class A2 {
	
	B2 b;

	public A2() {
		
		System.out.println(" A2 been initialized");
		
	}

	public A2(B2 b) {
		super();
		System.out.println(" inside A class constructor");
		this.b = b;
	}

	public B2 getB() {
		return b;
	}

	public void setB(B2 b) {
		
		System.out.println(" inside A class setter method");
		this.b = b;
	}

	@Override
	public String toString() {
		return "A2 [b=" + b + "]";
	}
	
	
	
	
	
}
