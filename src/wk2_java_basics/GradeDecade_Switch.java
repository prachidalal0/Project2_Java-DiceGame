package wk2_java_basics;

import java.util.Scanner;

public class GradeDecade_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Implement a Java class that converts a score to a grade, where 90-100 = A, 80-89 = B, etc.
		Use a var, int gradeDecade to identify the grade decade
		Use a switch statement to assign the grade based on gradeDecade
		E.g., switch(gradeDecade) {
				case 90 : 
					grade = “A”
					break;
			   }
		*/
	
	double score; 
	int gradeDecade;
	String grade = "F";
		// Create our scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt and readin for score 
		System.out.print("Enter a Score: ");
		score = input.nextDouble();
		
		//Assign a gradeDecade based on the score
		gradeDecade = (int)score / 10 * 10;
		if (gradeDecade < 60) gradeDecade = 0;
		// "if" makes "0" a catch all for anything under 60
		
		//switch to assign a grade based on the gradeDecade
		switch(gradeDecade) {
		
		case 100:
			//makes the same outcome for 100 and 90 (assign both codes) 
		case 90: 
			grade = "A"; 
			break; 
			//put in "break" so once code gets to break, it goes to end of code instead of going 
			//through the whole code
			
		case 80:
			grade = "B";
			break;
			
		case 70:
			grade = "C";
			break;
			
		case 60:
			grade = "D";
			break;
			
		case 0:
			grade = "F";
			break;
	
			
		}
		
		//Print the score, the gradeDecade and the grade
		System.out.println("Score: " + score + " Decade: " + gradeDecade + " Grade: " + grade);
		
		input.close();
	}

}
