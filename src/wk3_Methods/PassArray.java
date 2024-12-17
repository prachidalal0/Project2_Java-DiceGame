package wk3_Methods;

import java.util.Random;

public class PassArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		Implement a set of methods that gens random int values between 1 and 6 inclusive.
		Returns 1 random int value
		Returns an array of 5 random int values
		Returns an array of 5 int values that were passed as args
		Use Random class nextInt method to gen values
		Implement a method to print the values of a passed array
		Sort the values in the arrays using Arrays.sort method
		*/
		
		// both returning arrays from an invoke statement and passing arrays to 
		//a method to then have values printed. treat an array as a data strucnture 
		// instead of a variable 

		// Declare Variables
		//int x; 
		int[] array = new int[5];
		//int[] array2 = new int[5];
		
		// Get Values
		//x = getValue();
		//compiler knows which one to run in overloaded 
		// method because one does not have a value- random and 
		//one has 5 values- array that has a,b,c,d,e
		array = getArray(); //invoking 
		//array2 = getArray(2,4,3,6,1);
		
		// Print Values
		//System.out.println(x); 
		prtArray(array);
		//prtArray(array2);
		
	} //*************End of Main Method class methods below**********************

	// Method to return a single random int between 1 and 6
	public static int getValue () {
		Random random = new Random();
		return random.nextInt(6) + 1; 
		// disapears so have to have another statement to create another random object (line 41) 
	//********* everything below is an overloaded method (getArray is an overloaded method- have different arguments)*************	
	}
	
	// Method to return an array of 5 random int between 1 and 6
	public static int[] getArray() { //random --> no arguments
		Random random = new Random(); //random object
		// create 5 random values and return to array 
		int[] methodArray = new int[5];
		for (int i = 0; i < methodArray.length; i++) {
			methodArray[i] = random.nextInt(6) + 1; // update integer values
		}
			return methodArray; 
	}
	
	// Method to return an array of 5 passed values between 1 and 6
	// when creating an array, also create a method that dictates what values are.
	public static int[] getArray(int a, int b, int c, int d, int e) {
		int[] array = {a, b, c, d, e};
		return array;
	}
	
	
	// Method to print an array 
	//enhanced for loops are only used for arrays
	public static void prtArray(int[] array) { 
		for (int z : array) System.out.print(z + " ");
		System.out.println(); // advance the print action to the next line
	}
	
}
