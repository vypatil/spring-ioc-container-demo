package com.demo.BeanMethods;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/demo/BeanMethods/BeanMethod.xml");

		Student s1 = context.getBean("std1", Student.class);

		System.out.println(s1);

		System.out.println("Total Beans in container :" + context.getBeanDefinitionCount());

		String[] arr = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(arr));

		int AddressBeanCount = context.getBeanNamesForType(Address.class).length;

		System.out.println(AddressBeanCount);

	}

}
