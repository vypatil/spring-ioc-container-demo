package com.demo.constructorinjection;

public class Certificate {
	
	String certiName;

	public Certificate(String certiName) {
		super();
		this.certiName = certiName;
	}

	@Override
	public String toString() {
		
		return this.certiName;
	}
	
	
	

}
