package com.demo.springEntity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.springEntity.Student;

public class TestStudent_ioc_container {
	
	public static void main(String[] args) {
		
//		Student s1 = new Student(34 , "vaibhav" , "kolhapur");
//		
//		System.out.println(s1);  regular java object creation.
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springBeans.xml");
		
		Student s1 = context.getBean("sobj1" , Student.class);
		System.out.println(s1);
		
		System.out.println("-------------------------------");
		
		Student s2 = context.getBean("sobj2" , Student.class);
		System.out.println(s2);
		
		System.out.println(s1==s2);
		
		
		
	}

}
