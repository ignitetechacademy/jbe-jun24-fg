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
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class RetrieveAccountsServlet
 */
public class RetrieveAccountsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RetrieveAccountsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Getting All data from the databse");

		List<Account> accounts = new ArrayList();
		try {

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

				Account ac = new Account();
				ac.setAccountNumber(Integer.parseInt(rs.getString("acc_holder_number")));
				ac.setName(rs.getString("acc_holder_name"));
				ac.setBalance(Integer.parseInt(rs.getString("acc_balance")));
				accounts.add(ac);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		request.setAttribute("allAccounts", accounts);
		request.getRequestDispatcher("show.jsp").forward(request, response);
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


