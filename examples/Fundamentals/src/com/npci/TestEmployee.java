package com.npci;

public class TestEmployee {

	public static void main(String[] args) {
		// creating an object of Employee, type variable = value;
		Employee emp1 = new Employee(111,"Alex", 35000); 
		// emp1 -> [id = 111, name = Alex, salary = 35000.0]
		Employee emp2 = new Employee(222, "Brad", 45000); 
		// emp2 -> [id = 222, name = Brad, salary = 45000.0]	
		
		// accessing display()
		emp1.display();
		emp2.display();
	}

}
