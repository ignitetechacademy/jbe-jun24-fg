package com.lern.web.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Servlet implementation class FetchAccountServlet
 */
public class FetchAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FetchAccountServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Fetching acount");

		String acNumber = request.getParameter("an");
		System.out.println("acc Number : " + acNumber);

		Account acc = new Account();
		try {
			// load driver

			Class.forName("org.postgresql.Driver");
			System.out.println("Driver is loaded ...");

			// connect with database
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bank_data", "postgres",
					"24D@ta30");
			System.out.println("Connected with thedatabse");

			System.out.println("Please provide account number : ");
			int aNumber = Integer.parseInt(acNumber);

			// execute query
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM public.accounts WHERE acc_holder_number= " + aNumber);
			System.out.println("Query execution completed");

			Double accountBalance = 0d;
			
			// show result data
			if (rs.next()) {
				acc.setAccountNumber(Integer.parseInt(rs.getString("acc_holder_number")));
				acc.setName(rs.getString("acc_holder_name"));
				acc.setBalance(Integer.parseInt(rs.getString("acc_balance")));
			}
			System.out.println("Account " + aNumber + " - Balance " + accountBalance);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		request.setAttribute("oneAccount", acc);
		request.getRequestDispatcher("deposit.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
