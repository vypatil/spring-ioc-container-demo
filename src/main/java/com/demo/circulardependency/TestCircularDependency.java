package com.demo.circulardependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCircularDependency {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("CircularDependency.xml");
		
		ClassA a1 = context.getBean("Abean" , ClassA.class);
		System.out.println(a1);

		ClassB b1 = context.getBean("Bbean" , ClassB.class);
		System.out.println(b1);
	}

}
