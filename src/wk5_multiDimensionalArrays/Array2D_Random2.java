package wk5_multiDimensionalArrays;

import java.util.Random;

public class Array2D_Random2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Copy class Array2D_Random2_RowSum to Array2D_Random2_ColSum 
		Use array [3][3] and random values 0-9
		In main method, add logic to calculate and print  the sum of each col in the array
		*/



		//declare variables
		int[][] arrayRandom = new int[3][3];
		int sum; 
		int rowSum;
		int colSum; 

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
		
	
		
		//get row sum values and print them 
		rowSum = 0;
		for (int i = 0; i < arrayRandom.length; i++) {
			for (int j = 0; j < arrayRandom[i].length; j++) {
				System.out.printf("%2d ", arrayRandom[i][j]);
				rowSum = rowSum + arrayRandom[i][j];
		}
		System.out.print(" " + rowSum);
		System.out.println();
		rowSum = 0;
	}
		System.out.println();
		
		//get col sum values and print them 
		colSum = 0;
		int[] col = new int [arrayRandom[0].length];
		for (int i = 0; i < arrayRandom.length; i++) {
			for (int j = 0; j < arrayRandom[i].length; j++) {
				System.out.printf("%2d ", arrayRandom[i][j]);
				colSum = colSum + arrayRandom[j][i];
				
		}
		System.out.print(" " + colSum);
		col[i] = colSum;
		System.out.println();
		colSum = 0;
		
	}
		System.out.println(col[0] + " " + col[1] + " " + col[2]);
		
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


