package com.npci;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException1 {
	public static void main(String[] args) {
		System.out.println("main starts");
		int[] items = {5, 10, 15};
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter an index value to search the element");
			int index = scan.nextInt();
			System.out.println("Element: "+items[index]);
			scan.close();
		} catch(ArrayIndexOutOfBoundsException e) {
			// syserr is the short cut for below statement
			System.err.println("AIOBE occured: "+e.getMessage());
		} catch(InputMismatchException e) {
			System.err.println("IME occured: "+e);
			e.printStackTrace();
		}
		
		System.out.println("main ends");
	}
}
