package com.kakumani.db.plsql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExecuteProcedure {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver is loaded ...");

		// connect with database
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bank_data", "postgres",
				"24D@ta30");
		System.out.println("Connected with thedatabse");

		CallableStatement callStmt = con.prepareCall("CALL public.bank_std_account(?)");
		callStmt.setInt(1, 225);
		callStmt.execute();

		System.out.println("Procedure execution successful !!");
	}
}
