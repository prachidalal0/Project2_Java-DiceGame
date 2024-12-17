package wk5_multiDimensionalArrays;

public class Array3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Implement class, Array3D class
		Use array initializer to create a 3x3x3 array with int values from 1 to 27 sequentially
		Print the array using nested for loops
		*/
		
		int[][][] array = {
				{ {1,2,3}, {4,5,6}, {7,8,9} }, //this is a 2D array by itself
				{ {10,11,12}, {13,14,15}, {16,17,18} },
				{ {19,20,21}, {22,23,24}, {25,26,27} }
				};
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array[i][j].length; k++) {
				System.out.printf(" %d",array[i][j][k]);
			}
			
			System.out.println();
		}
			System.out.println();
		
	}

	} 
}
