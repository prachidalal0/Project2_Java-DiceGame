package wk8_Recursion;

public class RecMessage {

	public static void main(String[] args) {
		/*
		Implement a Java class, RecMessage
		Implement a class with main method vars String msg and int n
		In a method, use a for loop to print msg n times
		In a new method use a recursive algorithm to print msg n times
		*/

		String msg = "UT Dallas"; 
		int n = 4;
		
		prtMsg(msg, n);
		
		System.out.println();
		prtRecMsg(msg, n);

	} // end of main method 
	
	public static void prtMsg(String msg, int n) {
		for (int i = 0; i < n; i++) {
		System.out.println(msg);
		}
	}
	
	public static void prtRecMsg(String msg, int n) {
		if (n > 0) { 
			//calling the method inside of itself 
			// n - 1 bc n=4, n=3, n=2, n=1 and then n=0 fails the test in the if statement 
			prtRecMsg(msg, n-1);
			System.out.println(msg);
		}
	}
}