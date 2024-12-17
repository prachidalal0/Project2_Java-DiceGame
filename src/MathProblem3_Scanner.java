package wk1_java_basics;

import java.util.Scanner;

public class MathProblem3_Scanner {
	
	/*  Use Save As to make a copy of a file
	In Eclipse, use File > Save As to make another copy of the program
	Name the new file “MathProblem3”
	In the code body, change the class name to match the file name in the program code
	Edit the file as follows
	Create a Scanner object
	Import the Scanner class from java.util.*
	Prompt for x and y values to be input
	Redo Declare / Initialize using nextInt()
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create Scanner object and promt / read-in for vars
		Scanner input = new Scanner(System.in);
		
		//input we are using for scanner object method
		System.out.print("Enter Values for x: ");
		int x = nextInt();  
		System.out.print("Enter Values for y: ");
		int y = nextInt();
		
		// Declare and calculate z var (vars) 
		//int x;
		//int y;
		int z = x + y;
		
		//Initiailize Values
		//x = 2; 
		//y = 3; 
		//z = x + y; 
		
		// Print the equation
		System.out.println();
		System.out.println(x + " + " + y + " = " + z); 

	}


	}

	

