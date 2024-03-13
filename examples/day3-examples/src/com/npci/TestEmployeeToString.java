package com.npci;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestEmployeeToString {
	public static void main(String[] args) {
		Employee emp1 = new Employee(123, "Alex");
		Employee emp2 = new Employee(456, "Brad");
		
		// print emp1 & emp2 in s.o.p
		System.out.println(emp1);
		System.out.println(emp2);
		// most of the predefined classes have overidden toString to return a particular
		// detail of an object instead of memory address
		// java.time.LocalDate: predefined class which has overidden toString
		// LocalDate stores date in ISO format i.e., yyyy-MM-dd
		// current date
		LocalDate today = LocalDate.now(); // now is a static method of LocalDate
		System.out.println(today);
		// java.time.LocalTime: predefined class which has overidden toString to show time
		// current time
		LocalTime time = LocalTime.now(); // now is a static method of LocalTime
		System.out.println(time);
	}
}
