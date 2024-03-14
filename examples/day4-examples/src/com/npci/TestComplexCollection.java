package com.npci;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestComplexCollection {
	public static void main(String[] args) {
		// create 3 to 4 user objects atleast one duplicate object
		// LocalDate.parse("yyyy-MM-dd") must be the format else you will get error
		User user1 = new User(5, "Raj", LocalDate.parse("1999-10-25"));
		User user2 = new User(5, "Raj", LocalDate.parse("1999-10-25"));
		User user3 = new User(65, "Rajesh", LocalDate.parse("2000-10-25"));
		User user4 = new User(44, "Vijay", LocalDate.parse("1998-10-25"));
		// add all these users to the HashSet & observe the output
		Set<User> set = new HashSet<>();
		set.add(user1);
		set.add(user2);
		set.add(user3);
		set.add(user4);
		for(User user : set) {
			System.out.println(user);
		}
		// how to remove an element using an id - Iterator: next(), hashNext(), remove()
		int id = 44;
		// Iterator: it can iterate and also can remove the element
		// for: it can only iterate but can't remove the element
		Iterator<User> iterate = set.iterator();
		while(iterate.hasNext()) { // hasNext() returns true if next element is present
			User u = iterate.next(); // next() returns the object that is iterated
			if(u.getId() == id) { // if the iterated user id == id then remove
				iterate.remove(); // removes the iterated element
				break; // stops while loop iteration 
			}
		}
		System.out.println("----- Users in Set after Removing -----");
		for(User user : set) {
			System.out.println(user);
		}
	}
}
