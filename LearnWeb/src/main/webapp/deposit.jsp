<%@page import="com.lern.web.servlets.Account"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Deposit Amount</h2>
	
	<form action="depositAmount" method="get">
	<label>Account Holder Name</label><label><%=((Account)request.getAttribute("oneAccount")).getName() %></label>
	<br>
	<label>Account Number</label><label><%=((Account)request.getAttribute("oneAccount")).getAccountNumber() %></label>
	<br>
	<label>Account Balance</label><label><%=((Account)request.getAttribute("oneAccount")).getBalance() %></label>
	<br>
	<br>
	
	<input type="hidden" name="anumber" value="<%=((Account)request.getAttribute("oneAccount")).getAccountNumber() %>" >
	<input type="hidden" name="ebalance" value="<%=((Account)request.getAttribute("oneAccount")).getBalance() %>" >
	
	<input type="text" name="damount">
	<br>
	<input type="submit" value="Deposit Amount">
	</form>
</body>
</html>