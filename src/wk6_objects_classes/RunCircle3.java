package wk6_objects_classes;

//driver or main class
public class RunCircle3 {

	public static void main(String[] args) {
		
		//can use from a different file, different class in same package
		Circle3 circle3 = new Circle3(); //no-arg constructor (no arguments)
		Circle3 circle3b = new Circle3(); //no-arg constructor (no arguments)
		
		//created object circle3 so you can put the value in here
		//instead of line 17 and 19 
		Circle3 circle3c = new Circle3(20);
		
		//overriding radius = 1 in object class
		circle3.radius = 12;
		//can have more than 1 object at one point in time 
		circle3b.radius = 15;
		
		//invoke method 
		circle3.area = circle3.getArea();
		
		//have to indicate what object the variable is using (circle2.  ) 
		//System.out.println("Radius : " + circle3.radius + " Area: " + circle3.area);
		
		System.out.println("Circle3: " + circle3.radius);
		System.out.println("Circle3b: " + circle3b.radius);
		System.out.println("Circle3c: " + circle3c.radius);
		
	} // end of main method 
	
}

