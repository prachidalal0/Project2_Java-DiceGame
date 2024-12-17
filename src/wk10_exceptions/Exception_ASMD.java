package wk10_exceptions;

import java.util.Scanner;

public class Exception_ASMD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		A flashcard system requires user to enter operation with A, S, M, or D ( for add, sub, etc.)
		Implement Exception_ASMD to ensure only A, S, M, or D are entered – system won’t fail if non-ASMD entry occurs
		Read the entire line as entry (Scanner.nextLine())
		Convert to first character only (String.charAt(0))
		Convert to uppercase (String.toUpperCase())
		Use a do-while loop to test for correct entry
		*/

		//declare Vars
		String entry;
		boolean tryAgain = false;
		
		Scanner input = new Scanner(System.in);
		
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
				System.out.println("Entry must be A, S, M, or D. Please try again.");
				tryAgain = true;
			}
			
		} while(tryAgain);
}
}