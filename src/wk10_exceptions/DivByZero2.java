package wk10_exceptions;

import java.util.Scanner;

public class DivByZero2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Copy the DivByZero class to DivByZero2 – such that an exception is printed, 
		and the user is prompted to input new factors
		Use do-while loop
		Use try-catch statements
		Use ArithmeticException
		*/

		//declare vars
		int dividend = 56;
		int divisor = 0;
		int quotient = 0;
		boolean tryAgain = false;
		
	do {
		tryAgain= false;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Dividend: ");
		dividend = input.nextInt();
		System.out.print("Enter Divisor: ");
		divisor = input.nextInt();
		System.out.println(dividend + " / " + divisor + " = ");
		
		try {
			quotient = dividend / divisor;
		}
		//object of arithmetic exception (arithmetic exception is the class and ae is the object)
		catch (ArithmeticException ae) {
		//fails by not computing an error, but going to catch
		
			System.out.println("ArithmeticException" + ae);
			System.out.println("Re-enter divident and divisor");
			tryAgain = true;
	}
} while(tryAgain);
System.out.println(dividend + " / " + divisor + " = " + quotient);


}
}
