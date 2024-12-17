package wk10_exceptions;

import java.util.Scanner;

//object class 
public class Run_ASMD_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Implement a class – Run_ASMD_Exception.java –  
		with a method that returns the operation (A, S, M, or D) 
		and ensures only A, S, M, or D can be entered, 
		such that the system will not fail if a non-ASMD entry occurs
		*/

		Exception_ASMD asmd = new Exception_ASMD();
		
		String oper = asmd.getOperation();
		System.out.println(oper);
	}
	//declare Vars
	String entry;
	boolean tryAgain = false;
	
	Scanner input = new Scanner(System.in);
	
	public String getOperation() { 
		do {
			System.out.print("Enter A, S, M, or D for operation: ");
			String line = input.nextLine();
			char charEntry = line.charAt(0);
			entry = Character.toString(charEntry);
			entry = entry.toUpperCase();
			
			if (entry.equals("A") || entry.equals("S") || entry.equals("M") || entry.equals("D")) {
				tryAgain = false;
				System.out.println("Operation is " + entry);
			}
			
			else {
				System.out.println("Entry must be A, S, M, or D. Please try again");
				tryAgain = true;
			}
			
		} while (tryAgain);
		return entry;
	}
	}
	

