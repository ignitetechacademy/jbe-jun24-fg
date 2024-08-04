package com.kakumani.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteBankData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// load driver

		Class.forName("org.postgresql.Driver");
		System.out.println("Driver is loaded ...");

		// connect with database
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bank_data", "postgres",
				"24D@ta30");
		System.out.println("Connected with thedatabse");

		Scanner scan = new Scanner(System.in);

		System.out.println("enter Account number : ");
		int accId = scan.nextInt();

		// execute deletion query
		String iQuery = "DELETE FROM public.accounts WHERE acc_holder_number=?";

		PreparedStatement prepStmt = con.prepareStatement(iQuery);
		prepStmt.setInt(1, accId);

		prepStmt.execute();
		System.out.println("Deletion of data completed");
	}

}
