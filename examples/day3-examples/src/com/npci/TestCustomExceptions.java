package com.npci;

import java.util.Scanner;

// we need to create custom exceptions in a separate file

// checked exception
class InsufficientBalanceException1 extends Exception {
	// every subclass of Exception can call its constructor with parameters to initialize
	// the message
	// a constructor to initialize the error message
	public InsufficientBalanceException1(String err) {
		super(err); // this initializes the message property of Exception
		// so that e.getMessage() can print that message in the catch
	}
}
public class TestCustomExceptions {
	// any caller calls debit() must use try-catch, compiler forces them to use try-catch
	public static void debit(int amount) throws InsufficientBalanceException1 {
		if(amount > 200) {
			// a constructor that takes error message 
			throw new InsufficientBalanceException1("Sorry balance is insufficient");
			// debit is not handling the exception instead its propagated to the caller
			// so that caller must handle that exception
		} else {
			System.out.println("Amount debited: "+amount);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter amount: ");
		int amount = scan.nextInt();
		scan.close();
		// calling the debit method which is propagating the checked exception
		try {
			debit(amount);
		} catch (InsufficientBalanceException1 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Error Message: "+e.getMessage());
		}
		System.out.println("----- main ends here -----");
	}
}
