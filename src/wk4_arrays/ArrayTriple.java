package wk4_arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayTriple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		Copy ArrayDupe to ArrayTriple
		Declare a boolean value, triple, initialize to false
		Implement method, isTriple, checks for occurrence of a single value found 3 times in the array
		Returns boolean true if triple found, false if not found
		Invoke the method after the array is sorted
		Print the value of the var triple
		*/
		int [] array = new int[5];
		int sum; 
		boolean dupe = false;
		boolean triple = false;
		
		// get values using method getValues
		array = getValues();
		
		array = setArray(5, 1, 5, 4, 1);
		
		//print array values
		prtArray(array);
		
		sum = sumValues(array);
		System.out.print(sum);;
		
		// OR you could do this
		System.out.println(sumValues(array));
		
		prtArray2(array);
		
		sum = sumArray2(array);
		System.out.println(sum);
		
		Arrays.sort(array);
		prtArray2(array);
		
		//check for dupes
		dupe = isDupe(array);
		System.out.println("Dupe " + dupe);
		
		//invoke method (after sorted) 
		
		triple = isTriple(array);
		System.out.println("Triple " + triple);

	}

	// End of main method. Class Methods below

	//pass an array to a method, ready to receive an array. use brackets because passing an array
	//don't have to call it "test array" because test array 
	//(initialized in the beginning) is turned into array value in the method
	public static void prtArray(int[] array) {
		for (int i = 0; i < array.length; i++) { 
			System.out.print(array[i] + " ");
			
		}
		// advance to the next line
		System.out.println(); 
	}

	//put values into array as an argument. returning an array in the method. creating an array in the method and passing it back
	public static int[] setArray(int a, int b, int c, int d, int e) {

			//declare array inside method. array initializer statement
			int[] tempArray = {a, b, c, d, e};
			return tempArray;
	}
			
	// dont need parameters because using random. getting values on its own 	
	public static int[] getValues () {
		Random random = new Random ();
		int[] tempArray = new int[5];
		for (int i = 0; i < tempArray.length; i++) {
			tempArray[i] = random.nextInt(9) + 1; 
			
		}
		 
		return tempArray;
				

		}


	public static int sumValues (int[] array) {
		int tempSum = 0;
		for (int i = 0; i < array.length; i++)
			//tempSum = tempSum + array[i]; can do this OR
			tempSum += array[i];
		return tempSum;
	}

	// enhanced for loop
	public static void prtArray2(int[] array) {
		//void bc we are just printing
		for(int z : array) {
			System.out.print(z + " ");
		}
		//advance to next line
		System.out.println();
	}

	public static int sumArray2(int[] array) {
		int tempSum = 0;
		//no curly braces bc there is only one statement but you could if you wanted to
		for(int z : array)
			tempSum = tempSum + z;
		return tempSum;
		
	}

	//use "is" to name for Booleans 
	//use "get" when using an integer 
	//use "set" for not returning something
	public static boolean isDupe(int[] array) {
		// look at data in the array using loop
		
		for (int i = 0; i < array.length - 1; i++) {
			// array.length - 1 to take out out of bounds exception (for when it is false)
			//only checked next number because you are sorting
			// if you want to return dupe value, return array value 
			if (array [i] == array[i + 1])
				// when we return true, method will stop when we return
				//when you return, method executes 
				return true; 
		}
		return false;
	}

	
	public static boolean isTriple(int[] array) {
		for(int i = 0; i < array.length - 2; i++) {
			if (array [i] == array[i + 1] && array[i] == array[i+2])
				return true; 
		} 
		
			return false; 
		}
	
	
	}
		
	


