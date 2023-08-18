package com.demo.collectioninjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Emp.xml");
		
		Emp e1 = context.getBean("Emp" , Emp.class);
		
		System.out.println(e1);
		
		System.out.println("--------------------------------");
		
		System.out.println("Name of Emp--->"+e1.getName());
		System.out.println("Ph.no ---->"+e1.getPhones());
		System.out.println("Addrs of emp--->"+e1.getAddresses());
		System.out.println("Course list of emp--->"+e1.getCourses());

	}

}
