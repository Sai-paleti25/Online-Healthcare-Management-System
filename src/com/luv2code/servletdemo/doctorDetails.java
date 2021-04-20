package com.luv2code.servletdemo;

public class doctorDetails {
	
	
	private String FirstName ;
	private String LastName ;
	private String Gender;
	private String DOB;
	private String Mobile;
	private String Email;
	private String Password;
	private String Qualification;
	private String speciality;
	private String Experience;
	
	private String access_level;
	
	
	
	public doctorDetails(String firstName, String lastName, String gender, String dOB, String mobile, String email,
			String password, String qualification, String speciality, String experience) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Gender = gender;
		DOB = dOB;
		Mobile = mobile;
		Email = email;
		Password = password;
		Qualification = qualification;
		this.speciality = speciality;
		Experience = experience;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
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

	public String getQualification() {
		return Qualification;
	}

	public void setQualification(String qualification) {
		Qualification = qualification;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getExperience() {
		return Experience;
	}

	public void setExperience(String experience) {
		Experience = experience;
	}

	public String getAccess_level() {
		return access_level;
	}

	public void setAccess_level(String access_level) {
		this.access_level = access_level;
	}

	public doctorDetails(String email, String password, String access_level) {
		super();
		Email = email;
		Password = password;
		this.access_level = access_level;
	}

	
	

}
