package com.npci;

public class TestStrings {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = s1.concat("123");
		String s3 = "123;Raj;35000";
		System.out.println("--------String----------");
		System.out.println("s1 = "+s1+", s2 = "+s2);
		// split string by ;
		String[] s4 = s3.split(";");
		for(String s : s4) {
			System.out.println(s);
		}
		System.out.println("--------String Buffer-----------");
		StringBuffer sb1 = new StringBuffer("abc");
		sb1.append("123");
		System.out.println("sb1 = "+sb1);
		// comparing strings using equals
		System.out.println(s1.equals(s2)); // hello.equals("hello123") // false
		String s5 = "hello";
		System.out.println(s1.equals(s5)); // hello.equals("hello") // true
		// Note: String has overridden equals method from Object class to compare content
		// Note: StringBuffer has not overridden equals method from Object class so it
		// doesn't compare content instead compares memory address
		// String with new keyword
		String s6 = new String("hello");
		System.out.println("s5 & s6 memory: "+(s5 == s6));
		System.out.println("s5 & s6 content: "+s5.equals(s6));
		// trying with String buffer
		StringBuffer s7 = new StringBuffer("hello");
		StringBuffer s8 = new StringBuffer("hello");
		System.out.println("s7 = "+s7+", s8 = "+s8);
		System.out.println("s7 equals s8: "+s7.equals(s8));
	}
}
