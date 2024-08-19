package com.learn.spring.context.layers.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankDIService {

	@Autowired
	BankDIDAO dao;

	void createBankAccount(String n, int a) {

		int id = ((int) (Math.random() * 1000));
		System.out.println("Generated Id : " + id);

		int accId = ((int) (Math.random() * 100000));
		System.out.println("Generated Account id : " + accId);

		dao.insertAccount(n, a, id, accId);
	}
}
