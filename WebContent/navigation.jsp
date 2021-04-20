<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<% 
 if(session.getAttribute("userid")!=null&&session.getAttribute("access_level").equals("admin"))
{ %>
	<nav>
	<ul>
		<li><a href="logout.jsp">Logout</a></li>
		<li><a href="addDoctorDetails.jsp">Doctor Registration</a></li>
		<li><a href="patientsrecord.jsp">Patients Record</a></li>
		<li><a href="main.jsp">Home</a></li>
	  </ul>	  
</nav>
<%
}
else if(session.getAttribute("userid")!=null&&session.getAttribute("access_level").equals("user"))
{%>
<nav>
	<ul>
		<li><a href="logout.jsp">Logout</a></li>
		<li><a href="bookappointment.jsp">Appointment</a></li>
		<li><a href="patientdetails.jsp">patientdetails</a></li>
		<li><a href="main.jsp">Home</a></li>
	  </ul>	  
</nav>
<%	
}
else
{
%>
	<nav>
	<ul>
		<li><a href="login.jsp">Login</a></li>
		<li><a href="signup.jsp">Sign-Up</a></li>
		<li><a href="contact.jsp">Contact</a></li>
		<li><a href="home.jsp">Home</a></li>
	  </ul>	  
</nav>
<% }
%>