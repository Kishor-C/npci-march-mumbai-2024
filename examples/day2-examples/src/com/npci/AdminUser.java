package com.npci;

public interface AdminUser extends RegularUser {
	// book method is inherited to the AdminUser
	void modify(); // available only to the AdminUser
}	
// AdminUser can access book() & modify
// RegularUser can access book()
