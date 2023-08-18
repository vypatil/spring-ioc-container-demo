package com.demo.refernceinjection;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRefInjection {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("referenceinjection.xml.");
		
		A a1 = context.getBean("Aref" , A.class );
		
		System.out.println(a1.getRollno());
		System.out.println(a1.getB());
		
		System.out.println(a1);
		
		System.out.println(context.getBeanDefinitionCount());
		
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		
	}

}
