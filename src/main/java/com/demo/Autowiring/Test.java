package com.demo.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/demo/Autowiring/Autowiring.xml");
		
		Employee emp = context.getBean(Employee.class);
		
		System.out.println(emp);
		
	}

}
