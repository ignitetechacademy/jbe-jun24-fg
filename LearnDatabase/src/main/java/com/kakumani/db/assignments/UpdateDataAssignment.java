package com.kakumani.db.assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateDataAssignment {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// load driver

		Class.forName("org.postgresql.Driver");
		System.out.println("Driver is loaded ...");

		// connect with database
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bank_data", "postgres",
				"24D@ta30");
		System.out.println("Connected with thedatabse");

		Scanner scan = new Scanner(System.in);
		System.out.println("Please provide account number : ");
		int aNumber = scan.nextInt();

		System.out.println("Please choose option : 1) deposti 2) withdraw");
		int selectedOption = scan.nextInt();

		System.out.println("Enter the amount : ");
		int txAmount = scan.nextInt();

		// execute query
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM public.accounts WHERE acc_holder_number= " + aNumber);
		System.out.println("Query execution completed");

		Double accountBalance = 0d;
		// show result data
		if (rs.next()) {
			accountBalance = rs.getDouble("acc_balance");
		}
		System.out.println("Account " + aNumber + " - Balance " + accountBalance);

		if (selectedOption == 2) {
			if (txAmount > accountBalance) {
				System.out.println("Insufficient Funds : available balance " + accountBalance);
				return;
			}
			accountBalance = accountBalance - txAmount;
		} else {
			accountBalance = accountBalance + txAmount;
		}

		// execute insert query
		String iQuery = "UPDATE public.accounts SET acc_balance=? WHERE acc_holder_number=?";

		PreparedStatement prepStmt = con.prepareStatement(iQuery);
		prepStmt.setDouble(1, accountBalance);
		prepStmt.setInt(2, aNumber);

		prepStmt.execute();
		System.out.println("Updation of data completed");

	}
}
