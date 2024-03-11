package com.npci;

public class LoopsDemo {
	public static void main(String[] args) {
		// for loop
		System.out.println("--- For Loop ----");
		for(int i = 0; i <= 10; i = i + 2) {
			System.out.println("i = "+i);
		}
		// while loop: iterates until condition is true
		System.out.println("--- While Loop ----");
		int loopCounter = 0;
		while(loopCounter != 5) {
			loopCounter++;
			System.out.println("Counter = "+loopCounter);
		}
		// do while loop: iterates until condition is true, but iterates once atleast
		System.out.println("--- Do While Loop ----");
		int counter = 0;
		do {
			counter++;
			System.out.println("Counter = "+counter);
		}while(counter == 0);
		System.out.println("--- Understanding about arrays -----");
		/*
		 * Arrays: it maintains multiple elements
		 */
		int[] items = {20, 10, 50, 40, 30} ;
		// to access a particular element use index i.e., items[2];
		System.out.println("Item at index: 2 = "+items[2]);
		// to find the length of the array you use length property
		System.out.println("Size of an array = "+items.length);
		// trying to access outside the array index gives runtime error
		//System.out.println("Item at invalid index = "+items[6]);
		System.out.println("---- Iterating over an array -----");
		for(int index = 0; index < items.length; index++) {
			System.out.println("Item at : "+index+" is: "+items[index]);
		}
		System.out.println("--- Enhanced For Loop ----");
		// x is not an index, it is an iterator that iterates the element
		for(int x : items) { // x = 20, x = 10, x = 50, x = 40, x = 30
			System.out.println("x = "+x);
		}
	}
}
