package com.npci;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestCollection {
	public static void main(String[] args) {
		// Generics that defines what type of data you want to store like String, Employee
		Set<Integer> numbers = new HashSet<>(); 
		// <> automatically considers the type what is present at the left hand side 
		Set<String> strings = new TreeSet<>(); // stores in sorted order
		numbers.add(77);
		numbers.add(44);
		numbers.add(88);
		System.out.println("Numbers: "+numbers);
		//storing strings
		strings.add("Hello"); // sorts using ASCII, A - 65, a - 97
		strings.add("hello");
		strings.add("welcome");
		strings.add("HELLO");
		strings.add("hello");
		System.out.println("Strings: "+strings);
		// suppose you want to iterate then you can use for loop or Iterator 
		for(String s : strings) {
			if(s.equals("welcome")) {
				System.out.println("welcome is present");
				break; // for loop stops if condition is true
			}
		}
		// adding complex objects in the collection
	}
}
