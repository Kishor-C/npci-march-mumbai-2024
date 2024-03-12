package com.npci;

public class TestInheritance {
	public static void main(String[] args) {
		// creating person & employee object and calling getters to print their details
		
		Person person1 = new Person("Ajay", "Male");
		Employee employee1 = new Employee(111, "Sachin", "Male", 40000);
		
		System.out.println("Person Info: "+person1.getName());
		// calling inherited getName and Employee getId
		System.out.println("Employee Info: "+employee1.getId()+", "+employee1.getName()); 
	}
}
