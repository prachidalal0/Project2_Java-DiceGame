package wk4_arrays;

public class ArrayInitializer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Implement Java class, ArrayInitializer
		Declare an array, int[] array, size = 5 using an array initializer
		Print the array using a for loop
		---------------------------------------------------------
		Implement a method, prtArray, that prints a passed array
		Invoke prtArray to print the array values
		---------------------------------------------------------
		Implement a method, setArray, with 5 int args
		setArray returns an array from the args using an array initializer, then invoke the array 
		*/

		
		// Declare Variables
			// declare and allocate space
		//int [] array = new int[5];
		int [] testArray = {2, 4, 3, 9, 10};
		int[] test2Array = new int[5];
		
		// print values of the array
		for (int i = 0; i < testArray.length; i++) { 
			System.out.print(testArray[i] + " ");
			
		}
		// advance to the next line
		System.out.println(); 
		
		//invoke array
		prtArray(testArray);
		
		// create and print array usng a method setArray
		test2Array = setArray(4, 3, 9, 7, 1);
		prtArray(test2Array);
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
			
		
	}
	

