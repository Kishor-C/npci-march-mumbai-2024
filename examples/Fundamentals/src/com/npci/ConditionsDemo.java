package com.npci;

import java.util.Scanner;

public class ConditionsDemo {

	public static void main(String[] args) {
		// Use Scanner class to take input
		Scanner scan = new Scanner(System.in); // takes input from keyboard
		// scan.nextInt(), scan.nextDouble(), scan.nextFloat(), scan.next() ...
		System.out.println("Enter marks");
		int marks = scan.nextInt(); // waits for user to enter input
		if(marks >= 80) {
			System.out.println("First Class with Distinction");
		} else if(marks < 80 && marks >= 60) {
			System.out.println("First Class");
		} else if (marks < 60 && marks >= 50) {
			System.out.println("Second Class");
		} else {
			System.out.println("Falied");
		}
		// switch statement: it is for multiple conditions with single value
		// make the option dynamic
		System.out.println("Enter option:-");
		int option = scan.nextInt();
		switch(option) {
			case 1: System.out.println("Withdraw");
			break;
			case 2: System.out.println("Check Balance");
			break;
			case 3: System.out.println("Change Pin");
			break;
			default : System.out.println("Invalid option");
		}
		scan.close();
	}
}
