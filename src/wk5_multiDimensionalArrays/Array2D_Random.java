package wk5_multiDimensionalArrays;

import java.util.*;

public class Array2D_Random {

	public static void main(String[] args) {
		/*
		Create a class, Array2D_Random
		Declare a 2D int array to have 5 rows and 10 columns
		Using nested for loops, populate the array with random values between 0 and 99
		Print the array using a method with nested for loops – use the printf method to align the table
		*/
		
		//declare variables
		int[][] arrayRandom = new int[5][10];

		// create a random object random
		Random random = new Random();
		
		//populate the array 
		//first for loop processes is the rows
		for (int i = 0; i < arrayRandom.length; i++) {
			//second for loop processes length of column of particular row
			for (int j = 0; i < arrayRandom[i].length; j++) {
				arrayRandom[i][j] = random.nextInt(100);
				
			}
			prtArray(arrayRandom);
		}
	}
		
		//print array
		public static void prtArray(int[][] a) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					//System.out.print(a[i][j] + " ");
					System.out.printf("%2d", a[i][j]);
			}
			System.out.println();
		}
		
	}

}


