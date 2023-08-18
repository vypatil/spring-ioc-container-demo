package com.demo.collectioninjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("CollectionInjection.xml");

		Person p1 = context.getBean("person1", Person.class);
		System.out.println(p1);
		
		System.out.println(p1.getId());
		System.out.println(p1.getName());
		System.out.println(p1.getMobileNumbers());
		System.out.println(p1.getCourses());
		System.out.println(p1.getEmailId());
	}

}
