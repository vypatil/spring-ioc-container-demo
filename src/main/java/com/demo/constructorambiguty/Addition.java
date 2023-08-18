package com.demo.constructorambiguty;

public class Addition {

	private int a;
	private int b;

	public Addition(int a, double b) {
		this.a = a;
		this.b = (int) b;
		System.out.println("constructor : int , double ");
	}

	public Addition(double a, double b) { // double constructor is not present so need typecasting for creating.
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("constructor : double , double ");
	}

	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("constructor : int , int ");
	}

	// converting "String" into "int" using "parseInt()".
	public Addition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("constructor : String , String ");
	}

	public void sum() {
		System.out.println("Value of a=" + this.a);
		System.out.println("Value of b=" + this.b);
		System.out.println("sum is =" + (this.a + this.b));
	}

}
