package com.npci;

public class TestStatic {
	int x = 15;
	static int y = 20;
	
	public static void main(String[] args) {
		System.out.println("y in main = "+y);
		// print x value directly
		//System.out.println("x = "+x);
		TestStatic ts1 = new TestStatic();
		TestStatic ts2 = new TestStatic();
		ts1.x = 55;
		ts2.x = 77;
		ts1.demo(); // prints x of ts1, but y is common
		ts2.demo(); // prints x of ts2, but y is common
	}
	
	public void demo() {
		System.out.println("x in demo = "+x);
		System.out.println("y in demo = "+y);
	}
}
