package wk5_multiDimensionalArrays;

import java.util.Random;

public class Array2D_Random_ColSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Copy class Array2D_Random to Array2D_Random2 
		Change array to [3][3] and random values 0-9
		Add a method sum2DArray to the class to calculate / return the sum of the values
		Print the sum
		*/

		//declare variables
		int[][] arrayRandom = new int[3][3];
		int sum; 

		// create a random object random
		Random random = new Random();
		
		//populate the array 
		//first for loop processes is the rows
		for (int i = 0; i < arrayRandom.length; i++) {
			//second for loop processes length of column of particular row
			for (int j = 0; j < arrayRandom[i].length; j++) {
				arrayRandom[i][j] = random.nextInt(10);
				
			}
			prtArray(arrayRandom);
		}
		
		//sum the array using method sumArray2D
		sum = sum2DArray(arrayRandom);
		System.out.println(sum);
		
	}
		
		//print array
		public static void prtArray(int[][] a) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					//System.out.print(a[i][j] + " ");
					System.out.printf("%2d ", a[i][j]);
			}
			System.out.println();
		}
		
	}


public static int sum2DArray (int [][] a) {
	int tempSum = 0;
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
		tempSum = tempSum + a[i][j];
		// or tempSum += a[i][j];
	}
		
	}
	
	return tempSum;

}
}


