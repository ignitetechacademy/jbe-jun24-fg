package com.learn.spring.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExploreSpringAnnotationConfig {

	public static void main(String[] args) {

//		Calculations calc = new Calculations();
//		int total = calc.addition(100, 158);
//		System.out.println(total);

		ApplicationContext ac = new AnnotationConfigApplicationContext(AnnConfig.class);

		Calculations calc = ac.getBean(Calculations.class);
		int total = calc.addition(100, 158);
		System.out.println(total);
	}
}

@Configuration
class AnnConfig {

	//@Bean
	Calculations get() {
		return new Calculations();
	}
}
