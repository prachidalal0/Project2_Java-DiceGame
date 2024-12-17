package wk1_java_basics;

import java.util.Scanner;

public class GradeDecade_NestedIf {
	
	/*
	Implement a Java class that converts a score to a grade, where 90-100 = A, 80-89 = B, etc.
	Use nested if else statements to assign the values
	E.g., if (score < 60) grade = “F”;
			else {…}
	*/

	public static void main(String[] args) {
		
		// Declare vars
		double score;
		String grade = " "; //initialize grade
		
		// Create scanner Object and prompt / read-in a score
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a score: ");
		score = input.nextDouble(); 
		
		//determine grade based on score (no curly braces bc simple one line rules) 
		if (score < 60) grade = "F"; 
		else if (score > 70) grade = "D";
		else if (score < 80) grade = "C";
		else if (score < 90) grade = "B";
		else grade = "A";
		
		System.out.println(score + " " + grade); 
		
		input.close(); 

	}

}
