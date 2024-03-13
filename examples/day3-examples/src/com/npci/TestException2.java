package com.npci;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class TestException2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x value:");
		int x = scan.nextInt();
		scan.close();
		try {
			if(x == 1) throw new SQLException();
			if(x == 2) throw new ArrayIndexOutOfBoundsException();
			if(x == 3) throw new IOException();
		} catch(ArithmeticException e) {
			System.out.println("AE");
		} catch(RuntimeException e) {
			System.out.println("RTE");
		} catch(SQLException e) {
			System.out.println("SQLE");
		} catch(Exception e) {
			System.out.println("Exception");
		}
	}
}
