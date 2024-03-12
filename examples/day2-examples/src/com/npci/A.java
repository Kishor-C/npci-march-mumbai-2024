package com.npci;
/*
 * You can have only one public class in a java file & public class name & file name must be same
 */
// A is public
public class A {
	int i = 20; // visible within the package
	protected int j = 30;
	public final int k = 40;
}
// B is default 
class B {
	void test() {
		A a = new A();
		System.out.println(a.i);// accessing i from class A
		System.out.println(a.j);// accessing protected within the same package in a non-subclass
		System.out.println(a.k);// accessing public member
		// a.k = 500; // final variable can't be modified 
	}
	// Eclipse by default doesn't choose main inside non-public class, you must right click
	// select Run As -> search for this non-public class and then Run
	public static void main(String[] args) {
		B b = new B();
		b.test();
	}
}
