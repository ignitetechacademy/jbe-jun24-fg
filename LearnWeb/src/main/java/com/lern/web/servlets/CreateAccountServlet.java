package com.lern.web.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 * Servlet implementation class CreateAccountServlet
 */
public class CreateAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreateAccountServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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
		
		request.getRequestDispatcher("create.html").forward(request, response);
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
