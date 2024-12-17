package wk4_arrays;

import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Implement a Java class, ArrayScanner
		Prompt for number of elements and read-in the value for int n using Scanner
		Declare a String array with n elements
		Prompt for the values of the elements – enter the values on one line
		Print the values using a prtArray method
		Hint: test with a small number of elements, e.g., 5 or less
		*/

		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		int numElements; 
		// string can use words, letters or numbers 
		String[] elements; 
		
		
		//prompt for number of elements and enter number of elements 
		System.out.print("Enter number of elements: ");
		numElements = input.nextInt();
		
		//declare array size (allowed to use a variable) complete declaration of array elements
		elements = new String[numElements];
		
		System.out.print("Enter Element Values: ");
		for (int i = 0; i < elements.length; i++) {
			//next defaults to string so dont have to use next int or next double
			elements[i] = input.next();
		}
		
		prtArray(elements);
	} // End of main method. Class methods below
		
		public static void prtArray(String[] array) {
			for(int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
				System.out.println();
			}
		
	
	}


