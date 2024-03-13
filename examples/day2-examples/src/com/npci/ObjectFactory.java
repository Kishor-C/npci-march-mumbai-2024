package com.npci;
/*
 * Factory design pattern that creates the object
 */
public class ObjectFactory {
	public static RegularUser getInstance() {
		return new TicketBooking();
	}
}
