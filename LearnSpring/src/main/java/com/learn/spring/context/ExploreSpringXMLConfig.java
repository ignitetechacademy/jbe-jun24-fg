package com.learn.spring.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExploreSpringXMLConfig {

	public static void main(String[] args) {

//		Calculations calc = new Calculations();
//		int total = calc.addition(100, 158);
//		System.out.println(total);

		ApplicationContext ac = new ClassPathXmlApplicationContext("calc.xml");

		Calculations calc = ac.getBean(Calculations.class);
		int total = calc.addition(100, 158);
		System.out.println(total);
	}
}
