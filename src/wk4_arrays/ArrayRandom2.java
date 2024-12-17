package wk4_arrays;

import java.util.Random;

public class ArrayRandom2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		Copy ArrayRandom to a new class ArrayRandom2
		Declare sum
		Sum the elements using a method with a for loop and assign the return value to var sum
		Invoke the method
		Print the sum
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
		
		
	}

