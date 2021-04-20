<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <%@ page import="com.luv2code.servletdemo.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="2px">

<tr>
<th>patientName</th>
<th>Gender</th>
<th>DOB</th>
<th>Mobile</th>
<th>Email</th>
<th>marital_status</th>
</tr>

<c:forEach var="temp" items="${profile}">

<tr>
<td>${temp.getPatientName()}</td>
<td>${temp.getGender()}</td>
<td>${temp.getDOB()}</td>
<td>${temp.getMobile()}</td>
<td>${temp.getEmail()}</td>
<td>${temp.getMaritalstatus()}</td>

<br></b>
</tr>

</c:forEach>
</table>

</body>
</html>