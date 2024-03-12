package com.npci;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator calci = new Calculator();
		long result = calci.add(20L, 30); // add(long, long)
		System.out.println("Result in main method = "+result);
		// when does add(long, long) is invoked - when L is used or long variable is used
		String result2 = calci.add("abc", "123", "hello");
		System.out.println("Result in main method = "+result2);
	}

}
