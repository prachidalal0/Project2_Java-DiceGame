package wk4_arrays;

public class PrintFDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 use the print f method to print to console a boolean 
		 int and double variable
		 */
		
		//declare vars
		boolean tf = false; 
		int x = 987;
		double y = 101.56;
		//%b holds space for the string looking for arguments (get value tf) 
		//% holds space
		//b indicates boolean
		System.out.printf("Boolean: %b", tf);
		System.out.println();
		
		System.out.printf("Integer %d", x);
		System.out.println();
		
		System.out.printf("Double: $%6.2f",y);
		System.out.println();
	}

}
