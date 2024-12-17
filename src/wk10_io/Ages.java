package wk10_io;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Ages {

	public static void main(String[] args) throws IOException {
		/*
		Create a Documents folder, Output
		In Eclipse, implement class Ages
		Declare a File object, file, with a location of Documents\Output\Output.txt
		Declare a PrintWriter object writer with an argument of file
		In main method header, add throws IOException
		Declare variables String name = “Kevin” and integer age = 62
		Write the name and age to the Output1 file
		Close the writer object, writer.close()
		*/
		
		//declare variables and instantiate objects
		File file = new File("C:\\Users\\prachidalal\\Documents\\Outputs\\Output.txt");
		
		PrintWriter writer = new PrintWriter(file);
		
		String name = "Prachi";
		int age = 21;
		
		//Write output to the file 
		writer.print(name + " ");
		//writer.print(" ");
		writer.println(age); //use prt LINE on last field to advance to next record
		
		System.out.println(name + " " + age);
		
		writer.close();
		

	}

}
