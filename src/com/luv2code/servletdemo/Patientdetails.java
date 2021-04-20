package com.luv2code.servletdemo;

public class Patientdetails {

	
	private String patientName ;
	private String Gender;
	private String DOB;
	private String Age;
	private String Mobile;
	private String Email;
	private String Password;
	private String maritalstatus;
	private String access_level1;
	
	public Patientdetails(String patientName, String gender, String dOB, String age, String mobile, String email,
			String password, String maritalstatus) {
		super();
		this.patientName = patientName;
		Gender = gender;
		DOB = dOB;
		Age = age;
		Mobile = mobile;
		Email = email;
		Password = password;
		this.maritalstatus = maritalstatus;
	}
	
	

	public String getAccess_level() {
		return access_level1;
	}



	public void setAccess_level(String access_level) {
		this.access_level1 = access_level;
	}



	public Patientdetails( String access_level,String email, String password) {
		super();
		access_level1=access_level;
		Email = email;
		Password = password;
	}





	public Patientdetails(String patientName, String gender, String dOB, String mobile, String email,
			String maritalstatus) {
		super();
		this.patientName = patientName;
		Gender = gender;
		DOB = dOB;
		Mobile = mobile;
		Email = email;
		this.maritalstatus = maritalstatus;
	}



	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getAge() {
		return Age;
	}

	public void setAge(String age) {
		Age = age;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getMaritalstatus() {
		return maritalstatus;
	}

	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}

	@Override
	public String toString() {
		return "Patientdetails [patientName=" + patientName + ", Gender=" + Gender + ", DOB=" + DOB + ", Age=" + Age
				+ ", Mobile=" + Mobile + ", Email=" + Email + ", Password=" + Password + ", maritalstatus="
				+ maritalstatus + "]";
	}
	
	
	
	
}
