package com.kakumani.bank.app;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

// https://howtodoinjava.com/spring-mvc/spring-mvc-hibernate-crud-example/

@Controller
public class AccountCreation {

	@Autowired
	private SessionFactory sessionFactory;

	@RequestMapping("/caccount")
	String createBankAccount(HttpServletRequest request) {
		System.out.println("Account Creation data");

		String receivedName = request.getParameter("aname");
		System.out.println(receivedName);

		String receivedAmount = request.getParameter("aamount");
		System.out.println(receivedAmount);

		Account acc = new Account();
		acc.setAccHolderName(receivedName);
		acc.setAccBalance(Integer.parseInt(receivedAmount));

		int accId = ((int) (Math.random() * 100000));
		acc.setAccHolderNumber(accId);

		sessionFactory.getCurrentSession().save(acc);
		System.out.println("Spring - Hibernate integrted");
		
		return "create.jsp";
	}

}
