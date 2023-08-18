package com.demo.Autowiring;

public class Address {

	 String vilage;
	 String State;

	public String getVilage() {
		return vilage;
	}

	public void setVilage(String vilage) {
		this.vilage = vilage;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	@Override
	public String toString() {
		return "Address [vilage=" + vilage + ", State=" + State + "]";
	}

}
