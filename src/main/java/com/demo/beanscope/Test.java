package com.demo.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// singleton bean scope example
		ApplicationContext context = new ClassPathXmlApplicationContext("com/demo/beanscope/BeanScope.xml");

		Car c1 = context.getBean("carobj", Car.class);
		System.out.println(c1.hashCode());

		Car c2 = context.getBean("carobj", Car.class);
		System.out.println(c2.hashCode());

		System.out.println(c1 == c2);

		// singleton bean scope in multiple container example
		ApplicationContext context1 = new ClassPathXmlApplicationContext("com/demo/beanscope/BeanScope.xml");

		Car c3 = context.getBean("carobj2", Car.class);
		System.out.println(c3.hashCode());

		System.out.println(c1 == c3);

		// prototype bean scope example
		ApplicationContext context2 = new ClassPathXmlApplicationContext("com/demo/beanscope/BeanScope.xml");

		Car c4 = context.getBean("carobj2", Car.class);
		System.out.println(c4.hashCode());

		Car c5 = context.getBean("carobj2", Car.class);
		System.out.println(c5.hashCode());
		System.out.println(c4 == c5);

	}

}
