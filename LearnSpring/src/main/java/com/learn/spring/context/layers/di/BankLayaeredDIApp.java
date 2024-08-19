package com.learn.spring.context.layers.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

public class BankLayaeredDIApp {

	public static void main(String[] args) {

		// create an account
		String name = "Srinu";
		int balance = 2500;

		ApplicationContext ac = new AnnotationConfigApplicationContext(BankConfig.class);

		BankDIController controller = ac.getBean(BankDIController.class);
		controller.createAccount(name, balance);
	}

}

@Configuration
@ComponentScan(basePackages = "com.learn.spring.context.layers.di")
class BankConfig {

	@Bean
	BankDIController con() {
		return new BankDIController();
	}
}
