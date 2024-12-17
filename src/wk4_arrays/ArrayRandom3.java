package wk4_arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandom3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ENHANCED FOR LOOP
		
		/*
		Copy ArrayRandom2 to a new class ArrayRandom3
		Implement method prtArray2 and sumArray2 using enhanced for loops
		Invoke the new methods
		*/

		// Declare Variables
		// declare and allocate space
	int [] array = new int[5];
	int sum; 
	
	// get values using method getValues
	array = getValues();
	
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
/*public static int[] setArray(int a, int b, int c, int d, int e) {

		//declare array inside method. array initializer statement
		int[] tempArray = {a, b, c, d, e};
		return tempArray; */
//}
		
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


	}


