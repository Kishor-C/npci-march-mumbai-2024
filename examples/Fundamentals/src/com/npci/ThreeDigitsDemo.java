package com.npci;

import java.util.Scanner;

public class ThreeDigitsDemo {
	public static void main(String[] args) {
		// there are other ways to take 3 digits using 3 separate variables
		// x = scan.nextInt(), y = scan.nextInt(), z = scan.nextInt();
		// you can also store in an array of size 3
		// int[] arr = new int[3]; arr[0] = scan.nextInt(), arr[1] = scan.nextInt()
		Scanner scan = new Scanner(System.in);
		// printing digits in words
		System.out.println("Enter 3 digit number");
		int threeDigits = scan.nextInt();
		// converting the integer to string 
		String stringDigits = threeDigits + "";
		// String has charAt(index) to get a character from the index 
		for(int i = 0; i < 3; i++) {
			char x = stringDigits.charAt(i);
			switch(x) {
			case '0' : System.out.print("Zero");
			break;
			case '1' : System.out.print("One");
			break;
			case '2' : System.out.print("Two");
			break;
			case '3' : System.out.print("Three");
			break;
			case '4' : System.out.print("Four");
			break;
			case '5' : System.out.print("Five");
			break;
			case '6' : System.out.print("Six");
			break;
			case '7' : System.out.print("Seven");
			break;
			case '8' : System.out.print("Eight");
			break;
			case '9' : System.out.print("Nine");
			break;
			}
		}
		scan.close();
	}
}
