package com.npci;

// Every constructor of a subclass automatically calls default constructor
// of a superclass, but we can call parameterized constructor using super(args)
public class Employee extends Person {
	// Employee has a default constructor that calls default constructor of Person
	// because Person doesn't have default constructor it gives error
	private int id;
	private double salary;
	// Employee need a constructor to initialize id, name, gender & salary
	public Employee(int id, String name, String gender, double salary) {
		// by default compiler keeps super() in the 1st line of every constructor
		super(name, gender); // Person(String, String)
		this.id = id;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	// override display: You must have same method name & signature
	@Override
	public void display() {
		System.out.println("---- Employee Details ----");
		System.out.println("Id = "+id+",Name = "+getName()+",Gender = "+getGender()+",Salary = "+salary);
	}	
}

