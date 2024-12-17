package wk7_thinking_in_objects;

public class RunConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor c1 = new Constructor(); //using default constructor	
		
		//default constrcutor (no constructor created in class) 
		//every class has a default constructor until an explicit constructor is created 
		// ^ which is why there are now red errors 
		Constructor c2 = new Constructor(); // using default constructor 
		//did not create x private
		//if we did make it private, setter and getter methods 
		c2.x = 10;
		//constructor in one step after creating constructor in class
		Constructor c3 = new Constructor(10); // using constructor with one arg 
		
		
	}
	
}

	
	class Constructor { 
		//data vars 
		int x = 0; 
		
		//constructor
		Constructor() {} // to remove errors under the default constructor that were created 
		//after the explicit constructor was created, create a no arg constructor 
		Constructor(int x) {
		this.x = x;
		}
		
		//methods
	}

