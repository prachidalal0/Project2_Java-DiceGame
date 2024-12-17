package wk6_objects_classes;

//driver or main class
public class RunCircle4 {

	private static String radius;

	public static void main(String[] args) {

		/*
		Copy RunCircle2 to RunCircle4 with a main method
		Change Circle2 class to Circle4 class
		Implement a constructor with an arg, double r or radius
		Instantiate an additional Circle object with radius of 20
		Invoke getArea()
		*/

		//instantiation Circle4
		Circle4 circle4 = new Circle4(); // using the default constructor
		
		//overriding radius = 1 in object class
		circle4.radius = 5;
		circle4.area = circle4.getArea();
		
		//have to indicate what object the variable is using (circle2.  ) 
		System.out.println("Radius : " + circle4.radius + " Area: " + circle4.area);
		
		//circle 4b overriding default value of 10  (instead of doing it like we did it in line 22) 
		Circle4 circle4b = new Circle4(20);
		circle4b.area = circle4b.getArea(); 
		System.out.println("Circle4b Radius: " + circle4b.radius + " Area: " + circle4b.area);
		
	} // end of main method 
	
}

//object class
class Circle4 { // object class
	
	//Declare vars in class instead of main method to be used outside of this program
	double radius = 10; 
	double area; 
	
	//constructors (name is the name of the class)
	//override default value of 10
	Circle4(double r) { // explcit constructor. can't use default (line 19) constructor anymore
		radius = r;
		
	}
	
	Circle4() { //have to override default constructor 
		
	}
	
	//implement methods into object class
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
}
}

