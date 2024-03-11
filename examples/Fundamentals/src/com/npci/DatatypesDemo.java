package com.npci;

public class DatatypesDemo {
	public static void main(String[] args) {
		byte a = 127;
		int b = a; // value of a is assigned to b
		System.out.println("a = "+a);
		// string & expressions are concatenated with +
		System.out.println("a = "+a+", b = "+b);
		// by default numbers are treated as int not as long
		long c = 92933512980L;
		System.out.println("c = "+c);
		int d = 125;
		byte e = (byte)d; // 2bytes = 4bytes, type conversion
		System.out.println("e = "+e);
		double g = 40.45;
		float h = 40.45F; // by default fractions are treated as double not as float
		System.out.println("g = "+g+", h = "+h);
		// char uses single character with single quote, not double quotes
		char i = 'M';
		// boolean uses true/false
		boolean j = true;
		System.out.println("i = "+i+", j = "+j);
	}
}
