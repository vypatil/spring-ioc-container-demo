package com.demo.BeanMethods;

public class Address {
	
	int pin;
	String city;
	
	public Address() {
		super();
		System.out.println("add count");
	}

	public Address(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}

	
}
