<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOSPITAL</title>
<link rel='stylesheet' type="text/css" href="homestyle.css">
</head>
<body>
<% 
if(session.getAttribute("userid")==null)
{
	response.sendRedirect("login.jsp");
}

%>

<%@include  file="header.jsp" %>

 <%@include  file="navigation.jsp" %>
 
 
<section>
	<h1 align = "right">Welcome !!!</h1>
</section>


<%@include  file="footer.jsp" %>
</body>
</html>