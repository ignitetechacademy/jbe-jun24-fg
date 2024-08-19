package com.learn.spring.context.layers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BankDAO {

	void insertAccount(String aname, int amount, int id, int accId) {
		// create account by passing data to the database
		try {
			// load driver

			Class.forName("org.postgresql.Driver");
			System.out.println("Driver is loaded ...");

			// connect with database
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bank_data", "postgres",
					"24D@ta30");
			System.out.println("Connected with thedatabse");

			System.out.println("enter Account holder name : ");
			String name = aname;

			System.out.println("Enter opening amount : ");
			int openingAmount = amount;

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
			e.printStackTrace();
		}
	}
}
