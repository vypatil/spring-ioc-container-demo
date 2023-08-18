package com.demo.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/demo/constructorinjection/constructorinjection.xml");
		
		Pesrson p = context.getBean("person" , Pesrson.class);
		
		System.out.println(p);
		
	}

}
