package com.npci;


// create an implementation of Regular & Admin user in a separate java file
// each developer will have their own code to access Regular & Admin user methods

// a class that implements Admin & Regular user
class TicketBooking implements AdminUser, RegularUser {
	@Override
	public void book() {
		System.out.println("Ticket booking successful");
	}
	@Override
	public void modify() {
		System.out.println("Passenger details modified");
	}
}

public class TestAbstraction {
	// create main method that acts like 2 developers code to call book & modify
	public static void main(String[] args) {
		// below code is tightly coupled
		//TicketBooking tb = new TicketBooking(); // this object is shared to the developers
		
		
		// Developer-1 code - loosely coupled
		RegularUser regular = ObjectFactory.getInstance();
		regular.book();
		// Developer-2 code - loosely coupled
		System.out.println("----------------------");
		AdminUser admin = (AdminUser)ObjectFactory.getInstance();
		admin.book();
		admin.modify();
		
	}
}
