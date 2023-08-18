package com.demo.circulardependency;

public class B2 {

	A2 a;

	public B2() {

		System.out.println("B2 bean initialized ..");
	}

	public B2(A2 a) {
		super();
		System.out.println("inside B2 class constructor!!");
		this.a = a;
	}

	public A2 getA() {
		return a;
	}

	public void setA(A2 a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "B2 [a=" + a + "]";
	}

}
