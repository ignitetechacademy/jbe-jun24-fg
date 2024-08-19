package com.learn.spring.context.layers;

public class BanService {
	void createBankAccount(String n, int a) {
		BankDAO dao = new BankDAO();

		int id = ((int) (Math.random() * 1000));
		System.out.println("Generated Id : " + id);

		int accId = ((int) (Math.random() * 100000));
		System.out.println("Generated Account id : " + accId);

		dao.insertAccount(n, a, id, accId);
	}
}
