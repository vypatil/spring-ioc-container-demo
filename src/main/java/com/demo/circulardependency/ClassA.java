package com.demo.circulardependency;

public class ClassA {
	
	ClassB b;
	
	
	public ClassA (ClassB b) {
		super();
		System.out.println("inside A class constructor");
		this.b=b;
		
	}

	public ClassB getB() {
		return b;
	}

	public void setB(ClassB b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "ClassA [b=" + b + "]";
	}
	
	
	
	
	

}
