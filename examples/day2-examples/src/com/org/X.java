package com.org;

import com.npci.A;

public class X extends A {
	public static void main(String[] args) {
		A a1 = new A();
		//System.out.println(a1.j);
		X x = new X();
		System.out.println("j inside main = "+x.j); // j is inherited in X 
		x.test();
	}
	public void test() {
		System.out.println("j inside test = "+j); // j is inherited in X
	}
}
