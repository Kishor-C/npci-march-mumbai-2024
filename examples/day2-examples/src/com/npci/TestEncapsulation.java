package com.npci;

public class TestEncapsulation {
	public static void main(String[] args) {
		//assuming some one has registered or logged in so that UI wants to
		//update the password and display the emailId & password
		User user = new User("foo@gmail.com", "foo@123");
		printUserUI(user);
		// modify the password
		user.setPassword("newfoo@123");
		printUserUI(user);
	}
	// static method that prints user details
	public static void printUserUI(User user) {
		System.out.println("EmailId = "+user.getEmailId()+", Password = "+user.getPassword());
		System.out.println("___________________________________________________");
	}
}
