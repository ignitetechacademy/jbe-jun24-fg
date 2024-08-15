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

/**
 * Servlet implementation class DespositServlet
 */
public class DespositServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DespositServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Deposit money");

		String accNumber = request.getParameter("anumber");
		System.out.println("Acc Number : " + accNumber);

		String depostitAmount = request.getParameter("damount");
		System.out.println("Depost amount: " + depostitAmount);
		
		String openingAmount = request.getParameter("ebalance");
		System.out.println("Existing balance amount: " + openingAmount);
		
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver is loaded ...");

			// connect with database
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bank_data", "postgres",
					"24D@ta30");
			System.out.println("Connected with thedatabse");
			
			// execute insert query
			String iQuery = "UPDATE public.accounts SET acc_balance=? WHERE acc_holder_number=?";

			PreparedStatement prepStmt = con.prepareStatement(iQuery);
			prepStmt.setDouble(1, (Integer.parseInt(depostitAmount)) + (Integer.parseInt(openingAmount)));
			prepStmt.setInt(2, Integer.parseInt(accNumber));

			prepStmt.execute();
			System.out.println("Updation of data completed");
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
		
		request.getRequestDispatcher("fetch").forward(request, response);

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
