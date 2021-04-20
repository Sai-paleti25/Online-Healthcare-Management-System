package com.luv2code.servletdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;


public class Databaseconnection {
	
	private static final String Resultantset = null;
	private static DataSource dataSource;

	

	public Databaseconnection(DataSource dataSource2) {
		// TODO Auto-generated constructor stub
		
		dataSource=dataSource2;
	}



	public static boolean addPatientDetails(Patientdetails patientrecord) throws SQLException {
		
		
		// TODO Auto-generated method stub
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			// get db connection
			myConn = dataSource.getConnection();
			
			// create sql for insert
			String sql = "insert into patientdetails "
					   + "(patientName, Gender, DOB, Age, Mobile, Email, Password, maritalstatus ) "
					   + "values (?, ?, ?, ?, ?, ?, ?, ?)";
			
			myStmt = myConn.prepareStatement(sql);
			
			// set the param values for the student
			myStmt.setString(1, patientrecord.getPatientName());
			myStmt.setString(2, patientrecord.getGender());
			myStmt.setString(3, patientrecord.getDOB());
			myStmt.setString(4, patientrecord.getAge());
			myStmt.setString(5, patientrecord.getMobile());
			myStmt.setString(6, patientrecord.getEmail());
			myStmt.setString(7, patientrecord.getPassword());
			myStmt.setString(8, patientrecord.getMaritalstatus());
			
			
			
			// execute sql insert
			if((myStmt.execute()==false))
					{
				return true;
					}
			else
			{
				return false;
			}
			
		}
		finally {
			// clean up JDBC objects
			close(myConn, myStmt,null,null);
		}
		
	}



	private static void close(Connection myConn, PreparedStatement myStmt,Statement myStmt1,ResultSet myRs ) {
		// TODO Auto-generated method stub
		
		try {
			
			if (myStmt != null) {
				myStmt.close();
			}
			
			else if (myConn != null) {
				myConn.close();   // doesn't really close it ... just puts back in connection pool
			}
			
			else if (myStmt1 != null) {
				myStmt.close();
			}
			
			else if (myRs != null) {
				myConn.close();   // doesn't really close it ... just puts back in connection pool
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}



	public static boolean Login(String access_level,String email, String password) {
		

		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		String email1=email;
		String password1=password;
		String access_level1=access_level;
		String result=null;
		String sql=null;
		try {
			// get db connection
			myConn = dataSource.getConnection();
			
			System.out.println("acess"+access_level1);
			System.out.println("database logined");
			if(access_level1.equals("user"))
			{
				System.out.println("database entered");
				
			// create sql for insert
			 sql = "select * from  patientdetails where Email=? and Password=?";
			}
			else
			{
				 sql = "select * from  doctordetails where Email=? and Password=?";///create database tabled with doctordetails
			}
			
               
			myStmt = myConn.prepareStatement(sql);
			
			myStmt.setString(1, email1);
			myStmt.setString(2, password1);
			
			// execute query
			myRs = myStmt.executeQuery();
			
			// process result set
			if(myRs.next()) {
				return true;
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		close(myConn, myStmt,null,myRs);
		return false;
		
	}
	
	//

			
public static List<Patientdetails> Details() {
		
	List<Patientdetails> profile = new ArrayList<>();
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		
		
		try {
			// get db connection
			myConn = dataSource.getConnection();
		
			
			// create sql for insert
			String sql = "select * from  patientdetails where Email='spandnachowdary@gmail.com'";
					  
			
               
			myStmt = myConn.prepareStatement(sql);
			
			
			// execute query
			myRs = myStmt.executeQuery();
			
			// process result set
			while(myRs.next()) {
				
				String PatientName=myRs.getString("patientName");
				String Gender=myRs.getString("Gender");
				String DOB=myRs.getString("DOB");
				String Mobile=myRs.getString("Mobile");
				String Email=myRs.getString("Email");
				String maritalstatus=myRs.getString("maritalstatus");
				
				Patientdetails patientrecord=new Patientdetails(PatientName,Gender,DOB, Mobile, Email,maritalstatus);
				
				profile.add(patientrecord);
						
			}
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		close(myConn, myStmt,null,myRs);
		return profile;
		
	}







public static boolean addDoctorDetails(doctorDetails doctorrecord) throws SQLException {
	
	Connection myConn = null;
	PreparedStatement myStmt = null;
	
	try {
		// get db connection
		myConn = dataSource.getConnection();
		
		// create sql for insert
		String sql = "insert into doctordetails "
				   + "(FirstName,LastName, Gender, DOB, Mobile, Email, Password, Education, specilization, Experience ) "
				   + "values (?, ?, ?, ?, ?, ?, ?, ?,?,?)";
		
		myStmt = myConn.prepareStatement(sql);
		
		// set the param values for the student
		myStmt.setString(1, doctorrecord.getFirstName());
		myStmt.setString(2, doctorrecord.getLastName());
		myStmt.setString(3, doctorrecord.getGender());
		myStmt.setString(4, doctorrecord.getDOB());
		myStmt.setString(5, doctorrecord.getMobile());
		myStmt.setString(6, doctorrecord.getEmail());
		myStmt.setString(7, doctorrecord.getPassword());
		myStmt.setString(8, doctorrecord.getQualification());
		myStmt.setString(9, doctorrecord.getSpeciality());
		myStmt.setString(10, doctorrecord.getExperience());
		
		
		
		// execute sql insert
		if((myStmt.execute()==false))
				{
			return true;
				}
		else
		{
			return false;
		}
		
	}
	finally {
		// clean up JDBC objects
		close(myConn, myStmt,null,null);
	}
	
	

}
		
			
		
	
}
		
	


