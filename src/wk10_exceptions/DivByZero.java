package wk10_exceptions;

import java.util.Scanner;

public class DivByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Implement class, DivByZero with 2 integers where the first is divided by the second
		---------------------------------
		Change the second integer to zero
		---------------------------------
		Refactor the variable entries to Scanner inputs
		Enter a non-integer
		*/

		//declare vars
		int dividend = 56;
		int divisor = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Dividend: ");
		dividend = input.nextInt();
		System.out.print("Enter Divisor: ");
		divisor = input.nextInt();
		
		int quotient = dividend / divisor;
		
		System.out.println(dividend + " / " + divisor + " = " + quotient);
	}

}
