package wk8_Recursion;

public class RecFactorial {

	public static void main(String[] args) {
		/*
		Implement a Java class with the var int n in main
		Implement a class method that returns the value of n!
		Print the value of n! from the main method
		*/

		int n = 4;
		int factorial;
		
		factorial = calcFactorial(n);
		System.out.println();
		System.out.println(n + "!= " + factorial);

	}
	
	public static int calcFactorial(int n) {
		//works its way down not up 
		if (n > 0) {
			int x = n * calcFactorial(n-1);
			System.out.println(x);
			return x;
		}
		else 
			return 1;
	}

}
