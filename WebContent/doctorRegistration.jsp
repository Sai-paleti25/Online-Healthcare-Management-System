<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="homestyle.css">
<link rel="stylesheet" type="text/css" href="registration.css">
</head>
<body>
<%@include  file="header.jsp" %>

<%@include  file="navigation.jsp" %>
<section>

<form action="Hospitalmanagement" method="GET">
<input type="hidden" name="command" value="ADDDoctor" />
  <div class="container">
    <h1>Doctor Details</h1>
    <p>Please fill in this form to create an account.</p>


   <br> <label for="First Name"><b>First name</b><br></label>
    <input type="text" placeholder="First name" name="firstname" required><br>
    
     <br> <label for="Last name"><b>Last name</b><br></label>
    <input type="text" placeholder="Last name" name="Last name" required><br>

    <label for="Gender"><b>Gender</b><br></label>
    <input type="text" placeholder="Gender" name="gender" minlength="1" maxlength="6"><br>
    
    <label for="Date of birth"><b>Date of birth</b><br></label>
    <input type="date" placeholder="Date of birth" name="date of birth" required><br><br>
    
    <label for="Mobile"><b>Mobile</b><br></label>
    <input type="text" placeholder="Mobile" name="mobilenumber" required><br>
    
    <label for="Email"><b>Email</b><br></label>
    <input type="email" placeholder="Email ID" name="email" required><br>
    
    <label for="password"><b>Password</b><br></label>
    <input type="password" placeholder="Password" name="password" required><br>
    
    <label for="Qualification"><b>Qualification</b><br></label>
    <input type="text" placeholder="Education" name="Qualification" required><br>
    
    <label for="speciality"><b>Specialization</b><br></label>
    <input type="text" placeholder="speciality" name="speciality" required><br>
    
     <label for="Experience"><b>Experience</b><br></label>
    <input type="text" placeholder="Experience" name="Experience" required><br>
    
    <button type="submit" value="submit" class="registerbtn">Register</button>
  </div>
  
</form>
</section>

<%@include  file="footer.jsp" %>
</body>
</html>