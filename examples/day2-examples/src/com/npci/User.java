package com.npci;

public class User {
	// emailId & password
	private String emailId;
	private String password;
	// constructor to initialize the emailId & password
	public User(String emailId, String password) { 
		this.emailId = emailId;
		this.password = password;
	}
	// setter methods returns void and takes a parameter
	// getter methods return data and doesn't take any parameter
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() { 
		return emailId;
	}
	public String getPassword() {
		return password;
	}
}
