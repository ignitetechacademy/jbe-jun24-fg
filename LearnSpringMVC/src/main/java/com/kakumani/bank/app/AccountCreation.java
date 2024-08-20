package com.kakumani.bank.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class AccountCreation {

	@RequestMapping("/caccount")
	String createBankAccount(HttpServletRequest request) {
		System.out.println("Account Creation data");

		String receivedName = request.getParameter("aname");
		System.out.println(receivedName);

		String receivedAmount = request.getParameter("aamount");
		System.out.println(receivedAmount);

		try {
			// load driver

			Class.forName("org.postgresql.Driver");
			System.out.println("Driver is loaded ...");

			// connect with database
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bank_data", "postgres",
					"24D@ta30");
			System.out.println("Connected with thedatabse");

			System.out.println("enter Account holder name : ");
			String name = receivedName;

			System.out.println("Enter opening amount : ");
			int openingAmount = Integer.parseInt(receivedAmount);

			int id = ((int) (Math.random() * 1000));
			System.out.println("Generated Id : " + id);

			int accId = ((int) (Math.random() * 100000));
			System.out.println("Generated Account id : " + accId);

			// execute insert query
			String iQuery = "INSERT INTO public.accounts(acc_id, acc_holder_name, acc_holder_number, acc_balance)VALUES (?, ?, ?, ?)";

			PreparedStatement prepStmt = con.prepareStatement(iQuery);
			prepStmt.setInt(1, id);
			prepStmt.setString(2, name);
			prepStmt.setInt(3, accId);
			prepStmt.setInt(4, openingAmount);
			prepStmt.execute();
			System.out.println("Insertion of data completed");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return "create.jsp";
	}
}
