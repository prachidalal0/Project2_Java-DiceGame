package wk6_objects_classes;

public class RunSquare {

	public static void main(String[] args) {
		/*
		Implement a .java file with class RunSquare, class Square
		In Square, declare data var side
		In Square, implement methods that return the area and perimeter of the square
		In RunSquare, instantiate 3 Square object with side values of 1, 5, and 10
		In RunSquare, create an array of Square objects, using the 3 Square objects
		Print the side, area, and perimeter values of the object in the array
		*/

		Square sq1 = new Square(); //creates object with side = 1
		Square sq2 = new Square(5);
		Square sq3 = new Square(10);
		
		System.out.println(sq1.getArea() + " " + sq2.getArea() + " " + sq3.getArea());
		System.out.println(sq1.getPerimeter() + " " + sq2.getPerimeter() + " " + sq3.getPerimeter());
		
		Square[] squareArray = new Square[3];
		int i = 0;
		squareArray[0] = sq1;
		squareArray[1] = sq2;
		squareArray[2] = sq3;
		/*
			for (int i = 0; i < squareArray.length; i++) {
				System.out.println(squareArray[i].getSide() + " " + squareArray[i].getArea());
			}
			*/
squareArray[0].prtSquareArray(squareArray);
	
	

}

class Square { 
	//declare vars
	private double side = 1; 
	
	//create constructor instead of setter method 
	//create an object that specifies what side value is
	// constructor with an argument- can no longer use no arg default
	Square(double side) { 
		this.side = side;
	}
	//have to write out no arg constructor, can't use default constructor with the constructor above 
	//this is an explicit no arg constructor (not a default constructor) 
	Square() {} 
	// methods
	
	public double getSide(){ 
		return side;
		
	}
	public double getArea() {
		return Math.pow(side, 2);
	}
	
	public double getPerimeter() {
		return side * 4;
		
	}
	public void prtSquareArray(Square[] squareArray) { 
		for (int i = 0; i < squareArray.length; i++) {
			System.out.println(squareArray[i].getSide() + " " + squareArray[i].getArea());
			System.out.println();
	}
	}
}
