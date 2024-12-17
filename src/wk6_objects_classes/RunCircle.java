package wk6_objects_classes;

public class RunCircle {

	public static void main(String[] args) {

		/*
		Implement a class named RunCircle with a main method
		In main method:
		1 double variable – radius, assign value of 1
		Statement to invoke getArea(radius) method
		1 additional method – getArea(double r)
		getArea() is outside the main method
		r parameter corresponds to argument for radius
		Calculate / return the area of the circle
		Print the circle radius and area on console
		*/

		//Declare vars
		double radius = 1; 
		double area; 
		
		area = getArea(radius);
		
		System.out.println("Radius : " + radius + " Area: " + area);
		
		
		
	} // end of main method 
	
	public static double getArea(double r) {
		return Math.PI * Math.pow(r, 2);
}
	
}
