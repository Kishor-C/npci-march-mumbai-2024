class Welcome { 
	// main method - all the words start with lowercase except
	// String - starts from uppercase 'S'
	public static void main(String[] args) {
		// to print use System.out.print where 'S' is capital
		System.out.println("Our first java program!");
		System.out.println(args[0]); 
	}
}
// Compile - javac Hello.java ----> creates Welcome.class
// Execute - java Welcome -----> prints Our first java program!
// java Welcome system password@1234 