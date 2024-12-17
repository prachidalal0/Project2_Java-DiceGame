package wk2_loops;

import java.util.Scanner;

public class BlastOff1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Implement class BlastOff1 that counts down from an input integer and prints “Blast Off!” at the end of the countdown
		Use Scanner to get the countdown start number
		Use a while loop to run the countdown
		Measure the elapsed time in milliseconds to run the loop
		Use System.currentTimeMillis() for the start time and end time (the elapsed time is the difference in times)
		*/

	//Declare Vars (use long bc miliseconds (large value)
	int startNumber; //what we are going to readin
	long startTime;
	long endTime;
	long elapsedTime;
	int countDown; //this is the counter for our loop
		
	//Create Scanner Object, input
	Scanner input = new Scanner(System.in);
		
	// Promt and Readin the start number for countdown
	System.out.print("Enter the number to start the countdown: ");
	startNumber = input.nextInt();
		
	//while loop to process
	countDown = startNumber;
	startTime = System.currentTimeMillis();  
	while(countDown > 0) {
		System.out.println(countDown);
		countDown--;
	}
	System.out.println("Blast Off!");
	endTime = System.currentTimeMillis();
	elapsedTime = endTime - startTime; 
	
	System.out.println("While " + startNumber + " " + elapsedTime);
	
	input.close();

	}

}
