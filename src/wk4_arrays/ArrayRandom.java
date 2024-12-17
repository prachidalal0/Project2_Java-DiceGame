package wk4_arrays;

import java.util.Random;

public class ArrayRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		Copy ArrayInitializer to new Java class ArrayRandom
		Initialize the array elements with random int values 1 to 9
		inclusive using a method getValues
		Print the values using the prtArray method
		*/

		
		// Declare Variables
		// declare and allocate space
	int [] array = new int[5];
	
	// get values using method getValues
	array = getValues();
	
	//print array values
	prtArray(array);
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

}

