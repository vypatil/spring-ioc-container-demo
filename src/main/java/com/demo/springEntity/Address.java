package com.demo.springEntity;

public class Address {
	
	int pinCode;
	String city;
	
	public Address() {
		super();
		
	}

	public Address(int pinCode, String city) {
		super();
		this.pinCode = pinCode;
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [pinCode=" + pinCode + ", city=" + city + "]";
	}
	
	

}
