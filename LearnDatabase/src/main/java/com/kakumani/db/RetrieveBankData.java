package com.kakumani.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveBankData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// load driver

		Class.forName("org.postgresql.Driver");
		System.out.println("Driver is loaded ...");

		// connect with database
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bank_data", "postgres",
				"24D@ta30");
		System.out.println("Connected with thedatabse");

		// execute query
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM public.accounts ORDER BY acc_id ASC ");
		System.out.println("Query execution completed");

		// show result data
		while (rs.next()) {
			System.out.println(rs.getString("acc_holder_name"));
			System.out.println(rs.getString("acc_balance"));
			System.out.println("---------------------");
		}
	}

}
