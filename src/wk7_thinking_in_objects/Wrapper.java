package wk7_thinking_in_objects;

public class Wrapper {

	public static void main(String[] args) {

		/*
		Implement a Java class, Wrapper
		Declare 2 integer values as String vars 
		Print the sum of the 2 String vars
		Declare 2 int vars with the values of the String vars using Integer class method parseInt
		Print the sum of the 2 int vars
		Repeat the above using double values and the Double class method parseDouble
		*/

		//put in quotes bc its a string
		String strX = "5";
		String strY = "6";
		
		String strA = "2.345";
		String strB = "6.789";
		
		//can't do math in string, 5 + 6 = 56
		System.out.println(strX + strY);
		
		//wrapper class provides method to convert a string value to an integer value
		int x = Integer.parseInt(strX);
		int y = Integer.parseInt(strY);
		
		System.out.println(x + y);
		
		double a = Double.parseDouble(strA);
		double b = Double.parseDouble(strB);
		
		System.out.println(a + b);
		
		//double works the same 
	}

}
