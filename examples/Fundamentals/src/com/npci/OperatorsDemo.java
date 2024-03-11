package com.npci;

public class OperatorsDemo {
	public static void main(String[] args) {
		// post & pre increment 
		// always variable names must have meanings, avoid using a, b, c, 
		// variable names must start with lowercase followed by camel case 
		// if there are more than one word
		int counter = 0;
		int preCounter = ++counter; // increments first & assigns its value
		int value = 50;
		int postCounter = value++; // assigns first & then increments its value
		System.out.println("Pre Counter = "+preCounter+", Counter = "+counter);
		System.out.println("Post Counter = "+postCounter+", Value = "+value);
		int x = 2;
		int y = ++x; // y = 3, x = 3
		int z = x+2; // z = 5, x = 4
		
		System.out.println("x = "+x+", y = "+y+", z = "+z);
		
		
	}
}
