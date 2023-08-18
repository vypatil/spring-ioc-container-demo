 package com.demo.bean_lifecycle_using_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
	AbstractApplicationContext context=	new ClassPathXmlApplicationContext("com/demo/bean_lifecycle_using_xml/Samosa.xml");
		
		Samosa s1 = context.getBean("samosa" , Samosa.class);
		
		System.out.println(s1);
		
		// registering shutdown hook method of AbstractApplicationContext interface
		// this method used for invoking "destroy" method.
		context.registerShutdownHook();
		
		
	}

}
