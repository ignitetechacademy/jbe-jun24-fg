package com.kakumani.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreateBankData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// load driver

		Class.forName("org.postgresql.Driver");
		System.out.println("Driver is loaded ...");

		// connect with database
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bank_data", "postgres",
				"24D@ta30");
		System.out.println("Connected with thedatabse");

		Scanner scan = new Scanner(System.in);
		System.out.println("enter Account holder name : ");
		String name = scan.next();

		System.out.println("Enter opening amount : ");
		int openingAmount = scan.nextInt();

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
	}

}
