package com.demo.springEntity;

public class Student {
	
	int roll;
	String name;
	String address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		System.out.println("Setting student roll number through setter method/property");
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting student name through setter method/property");
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		System.out.println("Setting student address through setter method/property");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	
	

}
