<%@page
	import="jakarta.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@page import="com.lern.web.servlets.Account"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<h1>All Bank Accounts</h1>

	<table>
		<thead>
			<tr>Name
			</tr>
			<tr>Balanace
			</tr>
		</thead>

		<tbody>
			<tr>
				<td>Tom</td>
				<td>10000</td>
			</tr>
			<tr>
				<td>Dick</td>
				<td>20000</td>
			</tr>
			<tr>
				<td>Harry</td>
				<td>30000</td>
			</tr>
		</tbody>
	</table>

	<br>
	<hr>
	<br>
	<table border="1">
		<thead>
			<tr>Account Number
			</tr>
			<tr>Name
			</tr>
			<tr>Balanace
			</tr>
			<tr>Deposit</tr>
		</thead>

		<tbody>
			<!-- for loop to show the data -->
		<% List<Account> accList = (List<Account>) request.getAttribute("allAccounts"); 
		
			for(Account ac : accList){%>
				<tr>
				<td><%=ac.getAccountNumber() %></td>
				<td><%=ac.getName() %></td>
				<td><%=ac.getBalance() %></td>
				<td>
					<a href="fetchAccount?an=<%=ac.getAccountNumber() %>">
						Deposit
					</a>
				</td>
			</tr>
			<%}
		%>

		</tbody>
	</table>

</body>
</html>