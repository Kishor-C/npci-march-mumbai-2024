package com.npci;

public class Employee {
	int id;
	String name;
	double salary;
	// constructor to initialize id, name & salary
	Employee(int id, String name, double salary) {
		// this is used to differentiate between properties & parameter variable names
		// when they share the same name
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	// method that prints id, name and salary
	void display() {
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Salary = "+salary);
	}
}
// we need to create a code that wants to create object & call display - main
// main() method is an entry point and also used like a client code to test other codes
