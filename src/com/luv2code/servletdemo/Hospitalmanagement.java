package com.luv2code.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import com.luv2code.servletdemo.*;


/**
 * Servlet implementation class Hospitalmanagement
 */
@WebServlet("/Hospitalmanagement")
public class Hospitalmanagement extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * 
	 * 
	 */
	
	@Resource(name="jdbc/hospitalmanagement")
	private DataSource dataSource;
	String output=null;
	
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		
		Databaseconnection Databaseconnection = new Databaseconnection(dataSource);
		
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String thecommand= request.getParameter("command");
		
		if (thecommand == null) {
			thecommand = "LIST";
		}
		
		switch (thecommand)
		{
		case "ADD":
			try {
				addPatientdetails(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "ADDDoctor":
			try {
				addDoctordetails(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "LOGIN":
			try {
				Login(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "LIST":
			listStudents(request, response);
			break;
		default:
			break;
		}
			
	}


	private void listStudents(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		ArrayList<Patientdetails> details = (ArrayList<Patientdetails>) Databaseconnection.Details();
		request.setAttribute("profile", details);
		
		ArrayList<Patientdetails> profile=(ArrayList<Patientdetails>) request.getAttribute("profile");
		
		 for(Patientdetails std: profile)
	 		{
	 			out.println(" firstname :"+std.getPatientName());
	 			out.println(" gender :" +std.getGender());
	 			out.println("DOB :" +std.getDOB());
	 			out.println(" MOBILE :" +std.getMobile());
	 			out.println(" EMAIL :"+std.getEmail());
	 			out.println(" MARITALSTATUS :" +std.getMaritalstatus());
	 		} 	
		//request.getRequestDispatcher("/Patientprofile.jsp").forward(request, response);
		
	}


	private void Login(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Boolean loginConnection=false;
		String access_level=request.getParameter("access_level");
		String email=request.getParameter("username");
		String password=request.getParameter("password");
		System.out.println("accc: "+access_level);
		System.out.println("entered");
		if(access_level.equals("user"))
		{
			System.out.println("entered1");
Patientdetails patientrecord=new Patientdetails(access_level,email,password);
    loginConnection=Databaseconnection.Login(patientrecord.getAccess_level(),patientrecord.getEmail(),patientrecord.getPassword());
    out.println(loginConnection);
		}
		else
		{
			//doctorDetails doctorrecord=new doctorDetails(access_level,email,password);
			//loginConnection=Databaseconnection.Login(doctorrecord.getAccess_level(),doctorrecord.getEmail(),doctorrecord.getPassword());
		}
		
		 if(loginConnection)
		 
		 {
			 HttpSession session=request.getSession();
			 
			 session.setAttribute("userid", email);
			 
			 session.setAttribute("access_level",access_level );
			 
			try {
				response.sendRedirect("main.jsp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			try {
				System.out.println("enter");
				response.sendRedirect("login.jsp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 
		/* try {
			response.getWriter().println(output);
			response.getWriter().println(patientrecord.getEmail());
			response.getWriter().println(patientrecord.getPassword());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		 
		
	}


	private void addPatientdetails(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		// TODO Auto-generated method stub
		
		String patientName = request.getParameter("firstname");
		String Gender = request.getParameter("gender");
		String DOB = request.getParameter("date of birth");
		String Age = request.getParameter("age");
		String Mobile = request.getParameter("mobilenumber");
		String Email = request.getParameter("email");
		String Password = request.getParameter("password");
		String maritalstatus = request.getParameter(" marital");
		
		Patientdetails patientrecord=new Patientdetails(patientName,Gender,DOB, Age,Mobile, Email,Password, maritalstatus);
		
		if(Databaseconnection.addPatientDetails(patientrecord))
		{
		response.sendRedirect("login.jsp");
		
		}
		else
		{
			response.sendRedirect("signup.jsp");
		}
		
	}
	
	private void addDoctordetails(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		// TODO Auto-generated method stub
		
		String FirstName = request.getParameter("firstname");
		String LastName = request.getParameter("Last name");
		String Gender = request.getParameter("gender");
		String DOB = request.getParameter("date of birth");
		String Mobile = request.getParameter("mobilenumber");
		String Email = request.getParameter("email");
		String Password = request.getParameter("password");
		String Qualification = request.getParameter("Qualification");
		String speciality = request.getParameter("speciality");
		String Experience = request.getParameter("Experience");
		
		
		doctorDetails doctorrecord=new doctorDetails(FirstName,LastName,Gender,DOB,Mobile,Email,Password,Qualification,speciality,Experience);
		
		if(Databaseconnection.addDoctorDetails(doctorrecord))
		{
		response.sendRedirect("home.jsp");
		
		}
		else
		{
			response.sendRedirect("doctorRegistration.jsp");
		}
		
	}


}
