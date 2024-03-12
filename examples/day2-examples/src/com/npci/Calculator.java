package com.npci;

public class Calculator {
	public int add(int x, int y) {
		System.out.println("add(int, int)");
		return (x + y);
	}
	public String add(String x, String y, String z) {
		System.out.println("add(String, String, String)");
		return (x + y + z);
	}
	public long add(long x, long y) {
		System.out.println("add(long, long)");
		return (x + y);
	}
	// add(20.3, 40.3); add(20.3, 40L), add(40.0, 20.3F), add(40.3F, 20.3)
	public double add(double x, double y) {
		System.out.println("add(double, double)");
		return (x + y);
	}
	// add(20.3F, 40.3F), add(20.3F, 40), add(20.3F, 40L), 
	public float add(float x, float y) {
		System.out.println("add(float, float)");
		return (x + y);
	}
}
