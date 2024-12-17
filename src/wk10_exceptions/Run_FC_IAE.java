package wk10_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Run_FC_IAE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Implement class, Run_FC_IAE, with object class FC_IAE
		Implement a method that handles both situations of IllegalArgumentException 
		described above and provides prompt and exception messaging for each type of exception
		*/
		
		int numOfProblems;
		int lowRange;
		int highRange;
		int min;
		
		FC_IAE fc_iae = new FC_IAE();

		//System.out.print("Enter number of problems: ");
		min = 1;
		numOfProblems = FC_IAE.getIntValue("Enter number of problems: ",min, "Number of problems"
				+ "must be integer greater than 0" + "\n");
		
		System.out.println("\n" + "number of problems: " + numOfProblems);
		
		min = 0;
		
		lowRange = FC_IAE.getIntValue("Enter value for lowest factor: " , 0 , "Range must be integer"
				+ "greater than or equal to " + min + "\n");
		System.out.println("\n" + "Lowest value for factors:  " + lowRange);
		
		min = 1;
		highRange = FC_IAE.getIntValue("Enter value for highest factor: " , 0 , "Range must be integer"
				+ "greater than or equal to " + min + "\n");
		System.out.println("\n" + "Highest value for factors:  " + highRange);
	}

}

class FC_IAE {
	
	//declar vars
	boolean tryAgain = false;
	static Scanner input = new Scanner(System.in);
	
	
	//Methods 
	//instead of hardcoding them, we are sending them as arguments
	public static int getIntValue(String prompt, int min, String errmsg) {
	//Declare vars
		int value = 0;
		boolean tryAgain = true;
		
		do {
			System.out.print(prompt);
			//making sure it is an integer
			try {
			String line = input.nextLine();
			String[] lineSplit = line.split(" ");
			//we want the first word (using string method split) 
			value = Integer.parseInt(lineSplit[0]); //could throw exception
			tryAgain = false;
			
			//make sure value is greater than min
			if (value < min) {
				//need to set tryAgain as true so we stay inside the loop
				tryAgain = true;
				//illegal argument is vague, thats why we used catch statement
				throw new IllegalArgumentException();
			}
			
			}
			catch (InputMismatchException ime) {
				System.out.println(ime);
				System.out.print(errmsg);
			}
			
			catch (NumberFormatException nfe) {
				System.out.println(nfe);
				System.out.print(errmsg);
			}
			
			catch (IllegalArgumentException iae) {
				System.out.println(iae);
				System.out.println(errmsg);
			}
			
			catch(Exception e)
			{
				System.out.println(e);
				System.out.println(errmsg);
			}
			
		} while(tryAgain);
		return value;
	}
}
