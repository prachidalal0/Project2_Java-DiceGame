package wk6_objects_classes;

public class Circle3 {

	//does not do anything unless invoked in main method until object is declared in line 25 and 27
	//just creates tools to use for objects we created 
	
	//Declare variables in class instead of main method to be used outside of this program
	double radius = 1; 
	double area; 
	
	//constructors (special methods)  
	//name is always the same as a class
	//assign specific value to radius
	//default constructor (every class has one) 
	Circle3(double r) {
		radius = r;
	}
	
	//no argument constructor
	Circle3() {}
	
	//implement methods into object class
	//don't use term static 
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
}
}
