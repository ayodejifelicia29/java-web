<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page demo</title>
</head>
<body>
	<%@ include file="navbar.jsp" %>

	
	<% 
	String nom = request.getParameter("nom");
	String age = (String) request.getAttribute("formatedAge");
	
	%>
	
	<% if(nom != null){ %>
		coucou c 'est du html
	
	<% }%>
	
	<li> Nom : <%=nom%></li>
	<li> Age : <%=age%></li>
	
</body>
</html>