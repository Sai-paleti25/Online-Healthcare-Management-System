<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="homestyle.css">
<link rel="stylesheet" type="text/css" href="registration.css">
</head>
<body>
<%@include  file="header.jsp" %>

<%@include  file="navigation.jsp" %>
<section>

<form action="Hospitalmanagement" method="GET">
<input type="hidden" name="command" value="ADD" />
  <div class="container">
    <h1>Register</h1>
    <p>Please fill in this form to create an account.</p>


   <br> <label for="Patientname"><b>Patient name</b><br></label>
    <input type="text" placeholder="First name" name="firstname" required><br>

    <label for="Gender"><b>Gender</b><br></label>
    <input type="text" placeholder="Gender" name="gender" minlength="1" maxlength="6" required><br>
    
    <label for="Date of birth"><b>Date of birth</b><br></label>
    <input type="date" placeholder="Date of birth" name="date of birth" required><br>
    
    <label for="Mobile"><b>Mobile</b><br></label>
    <input type="text" placeholder="Mobile" name="mobilenumber" required><br>
    
    <label for="Email"><b>Email</b><br></label>
    <input type="email" placeholder="Email ID" name="email" required><br>
    
    <label for="password"><b>Password</b><br></label>
    <input type="password" placeholder="Password" name="password" required><br>
    
    <label for="Marital Status"><b>Marital Status</b><br></label>
    <select name="marital">
    <option>married</option>
    <option>single</option>
    </select>
<br><br>
    <button type="submit" value="submit" class="registerbtn">Register</button>
  </div>
  
</form>
</section>

<%@include  file="footer.jsp" %>
</body>
</html>
