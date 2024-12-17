package wk10_io;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Ages2 {

	public static void main(String[] args) throws IOException {
		/*
		Copy class Ages to Ages2
		Declare a File object, file, with a location of Documents\Output\Output2.txt
		Declare a PrintWriter object writer with an argument of file
		In main method header, add throws IOException
		Declare String[] name = {“Kevin”, “Joe”, “Kamala”};
		Declare int[] age = {62, 78, 57};
		Write the name and age to the Output2 file
		Close the writer object, writer.close()
		*/
		
		//declare variables and instantiate objects
		File file = new File("C:\\Users\\prachidalal\\Documents\\Outputs\\Output2.txt");
		
		PrintWriter writer = new PrintWriter(file);
		
		String [] name = {"Prachi", "Joe", "Camala"};
		int[] age = {21, 78, 57};
		
		//Write output to the file 
		for (int i = 0; i < name.length; i++) {
			
		writer.printf("%-10s %3d \n", name[i], age[i]);
		//writer.print(" "); //use print LINE on last field to advance to next record
		System.out.printf("%-10s %3d \n", name[i], age[i]);
		
		}
		writer.close();
		

	}

}
