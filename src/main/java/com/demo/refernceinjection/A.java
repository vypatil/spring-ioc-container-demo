package com.demo.refernceinjection;

public class A {

	int rollno;
	B b;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "A [rollno=" + rollno + ", b=" + b + "]";
	}

	
	  
}
