package com.npci;

interface Vehicle { 
	void mileage();
	void wheels();
}
// a class can provide implementation to the Vehicle, but it must know the logic of
// all the methods, else it must be made abstract
abstract class Bike implements Vehicle {
	@Override
	public void wheels() {
		System.out.println("Wheels: 2");
	}
	// The reason mileage method is kept abstract is to let subclasses know they must
	// implement it, if you implement mileage here, then subclasses will not come to 
	// know it must implement mileage
}
// another abstract class Car can implement Vehicle as well
// There can be multiple subclasses for Bike
class KTM extends Bike {
	@Override
	public void mileage() {
		System.out.println("KTM mileage: 45kmpl");
	}
}
// implement few more subclasses for Bike like Pulsar, RoyalEnfield
class Pulsar extends Bike {
	@Override
	public void mileage() {
		System.out.println("Pulsar mileage: 50kmpl");
	}
}
// This file contains many classes which must be created in separate files, but for demo
// purpose we are keeping in single file
public class TestAutomobiles {
	public static void main(String[] args) {
		// we can't create the object of interface & abstract class
		KTM ktm = new KTM();
		Pulsar pulsar = new Pulsar();
		// pass the above objects to print
		print(ktm); // mileage() & wheels() of Vehicle is called on KTM object
		print(pulsar);// mileage() & wheels() of Vehicle is called on Pulsar object
	}
	// we can achieve polymorphism with interface & multiple implementation
	public static void print(Vehicle v) {
		v.mileage(); // polymorphic 
		v.wheels(); // polymorphic
		System.out.println("___________________");
	}
}
