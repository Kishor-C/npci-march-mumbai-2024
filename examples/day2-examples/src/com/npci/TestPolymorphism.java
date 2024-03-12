package com.npci;

public class TestPolymorphism {
	public static void main(String[] args) {
		// We are achieving Runtime Polymorphism
		// We cannot predict the output unless we know on which object the method is called, hence
		// it is called Runtime Polymorphism
		Person px = new Person("Raj", "Male");
		Employee ex = new Employee(111, "Vijay", "Male", 40000);
		test(px);
		test(ex);
	}
	// test method must accept all the Person types & their sub-types
	public static void test(Person p) { // p = ex = new Employee(111, "Vijay", "Male", 40000);
		// we can't predict the output of p.display()
		p.display(); // polymorphic behavior occurs here
		System.out.println("---------------------------------------");
	}
}
/*
 * 
 * int x = 50;
 * (HT)long y = (LT)x; // fine
 * (LT)int z = (HT)y; // cte
 * 
 * HT = LT
 * Person = Employee
 * Person = Customer
 * Person = Student
 */
