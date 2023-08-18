package com.demo.constructorinjection;

public class Pesrson {

	String name;
	int mob_no;
	Certificate certi;

	public Pesrson(String name, int mob_no, Certificate certi) {
		super();
		this.name = name;
		this.mob_no = mob_no;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Pesrson [name=" + name + ", mob_no=" + mob_no + ", certi=" + certi + "]";
	}

	/*@Override
	public String toString() {
		return this.name + ":" + this.mob_no + "{" + this.certi.certiName + "}";
	}
*/
	
	
	
}
