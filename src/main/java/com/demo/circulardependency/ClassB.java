package com.demo.circulardependency;

public class ClassB {
	
	ClassA a ;

	public ClassB(ClassA a) {
		super();
		System.out.println("inside B class constructor");
		this.a = a;
	}

	public ClassA getA() {
		return a;
	}

	public void setA(ClassA a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "ClassB [a=" + a + "]";
	}
	
	

}
