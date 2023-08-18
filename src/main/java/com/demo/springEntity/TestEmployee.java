package com.demo.springEntity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.springEntity.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Employee.xml");
		
		Employee e1 = context.getBean("Emp1" , Employee.class);
		
		System.out.println(e1);
		
		Employee e2 = context.getBean("Emp2" , Employee.class);
		
		System.out.println(e2);
		
		Employee e3 = context.getBean("Emp3" , Employee.class);
		
		System.out.println(e3);
		
		
		
	}
}
