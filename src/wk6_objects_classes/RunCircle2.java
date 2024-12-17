package wk6_objects_classes;

//driver or main class
public class RunCircle2 {

	private static String radius;

	public static void main(String[] args) {

		/*
		Copy RunCircle to RunCircle2 class
		Below the class body, implement an additional class, Circle2
		In main method, instantiate a Circle2 object circle2
		Include the statement to invoke getArea(radius) method
		Print the circle radius and area on console
		In Circle2 class
		Declare variable radius initialized to 1
		Implement getArea(double r)
		Calculate / return the area of the circle
		*/
		
		//instantiate example: 
		// Scanner input = new Scanner(System.in);
		// Random random = new Random();
		// input is an object like scanner (input.nextInt)
		
		//instantiation of Circle2 object classed circle2
		//object circle2 is a copy of class circle2
		//object we can manipulate even though it has all the atributes that are in the class
		Circle2 circle2 = new Circle2();
		
		//overriding radius = 1 in object class
		circle2.radius = 5;
		
		circle2.area = circle2.getArea();
		
		//have to indicate what object the variable is using (circle2.  ) 
		System.out.println("Radius : " + circle2.radius + " Area: " + circle2.area);
		
	} // end of main method 
	
}

//object class
class Circle2 { // object class
	
	//does not do anything unless invoked in main method until object is declared in line 25 and 27
	//just creates tools to use for objects we created 
	
	//Declare vars in class instead of main method to be used outside of this program
	double radius = 1; 
	double area; 
	
	//implement methods into object class
	//don't use term static 
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
}
}
