package wk3_Methods;

import java.util.Random;
import java.util.Scanner;

public class FlashCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare variables
		
		int x; int y; 
		int sum; 
		int response; 
		
		//create objects for scanner and random
		
		Scanner input = new Scanner(System.in);
		
		//present the problem 
		x = getAddend(); 
		y = getAddend(); 
		sum = x + y;
		System.out.print(x + " + " + y + " = ");
		
		//get a response to the problem
		
		response = input.nextInt();
		
		//evaluate the response and print correct or incorrect
		
		evaluate(sum, response);
		
	}   //End of main method. Class methods are below. 
	
	public static int getAddend() {
		Random random = new Random(); 
		int z = random.nextInt(11);
		return z;
	}

	
	public static void evaluate(int sum, int response) {
		if (response == sum) {
			System.out.println("Correct!"); 
		} 
	else {
	System.out.println("Incorrect. Correct answer is: " + sum);
		}
	}
	
}
