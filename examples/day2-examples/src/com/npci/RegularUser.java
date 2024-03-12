package com.npci;

public interface RegularUser {
	void book(); // by default interface methods are public & abstract
}
/*
 *  Create another interface AdminUser that extends RegularUser, which 
 *  will have book() method inherited and modify method only for Admin
 */
