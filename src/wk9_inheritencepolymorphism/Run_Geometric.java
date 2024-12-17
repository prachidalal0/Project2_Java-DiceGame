package wk9_inheritencepolymorphism;

public class Run_Geometric {

	public static void main(String[] args) {

		/* Implement driver class Run_Geometric and object classes Geometric, Circle, and Rectangle
		Geometric: protected double var area, public method prtArea
		Circle: private double var radius (3), public method setArea
		Rectangle: private double vars length (10)/height (20), public method setArea
		Driver: instantiate a Circle object and Rectangle object, invoke setArea and prtArea for each object */

		Circle circle1 = new Circle();
		Rectangle rec1 = new Rectangle();
		
		circle1.setArea();
		circle1.prtArea();
		
		rec1.setArea();
		rec1.prtArea();
		
		Triangle triangle1 = new Triangle();
		
		triangle1.setArea();
		triangle1.prtArea();
		
	}

}

class Geometric {
	protected double area;
	
	public void prtArea() {
		System.out.println(area);
	}
}
//access area by inheriting members from geometric 
class Circle extends Geometric {
	private double radius = 3;
	
	public void setArea() {
		area = Math.PI * Math.pow(radius, 2);
	}
	
}

class Rectangle extends Geometric {
	private double length = 10;
	private double height = 20;
	
	public void setArea() {
		area = length * height;
	}
}
	
class Triangle extends Geometric {
	private double base = 3; 
	private double height = 2; 
	
	public void setArea() {
		area = (base * height)/2;
		
	}
}
