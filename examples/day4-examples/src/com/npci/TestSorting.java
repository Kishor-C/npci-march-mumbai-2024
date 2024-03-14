package com.npci;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestSorting {
	public static void main(String[] args) {
		User u1 = new User(77, "Raj", LocalDate.parse("1998-10-25"));
		User u2 = new User(55, "Zaheer", LocalDate.parse("2000-11-26"));
		User u3 = new User(66, "Yuvraj", LocalDate.parse("1995-10-25"));
		User u4 = new User(44, "Sachin", LocalDate.parse("1999-10-25"));
		//Comparator to compare LocalDate
		Comparator<User> dobDesc = new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				// TODO Auto-generated method stub
				return o2.getDob().compareTo(o1.getDob());
			}
			
		};
		//Comparator to compare LocalDate
		Comparator<User> nameAsc = new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			
		};
		// If you want to add the complex types to the TreeSet it must either implement
		// Comparable or Comparator
		Set<User> users = new TreeSet<>(nameAsc); // passing Comparator
		users.add(u1); // compares user object with another user object
		users.add(u2);
		users.add(u3);
		users.add(u4);
		
		for(User u : users) {
			System.out.println(u);
		}
	}
}
