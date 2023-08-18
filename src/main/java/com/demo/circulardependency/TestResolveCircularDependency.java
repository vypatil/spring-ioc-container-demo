package com.demo.circulardependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestResolveCircularDependency {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("CircularDependency2.xml");
		
		A2 obj1 = context.getBean("A2",A2.class);
		System.out.println(obj1);
		
		B2 obj2 = context.getBean("B2",B2.class);
		System.out.println(obj2);
	}
}

