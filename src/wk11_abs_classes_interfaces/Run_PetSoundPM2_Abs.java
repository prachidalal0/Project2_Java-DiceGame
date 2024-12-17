package wk11_abs_classes_interfaces;

public class Run_PetSoundPM2_Abs {

	public static void main(String[] args) {

		/*  Second iteration
		Copy Run_PetSound class and subclasses, adding _Abs to class names
		Convert getSound method in PetSound_Abs to abstract, and change PetSound_Abs class declaration to abstract
		Add getMotto method to PetSound_Abs
		Implement Run_PetSound_Abs with main method
		In Run_PetSound_Abs, create dogAbs object and invoke dogAbs.getSound and dogAbs.getMotto methods
		*/
		
		DogSound dog = new DogSound();
		dog.petSound();
		
		CatSound cat = new CatSound();
		cat.petSound();
		
		TurtleSound turtle = new TurtleSound();
		turtle.petSound();
	}
}
 abstract class PetSound_Abs { //now declared as an abstract class
	 //no curly braces in abstract class - template for subclasses, requires you to override abstract method 
	public abstract void petSound(); //abstract method
	
	//not all methods in an abstract class have to be abstract 
	public void getMotto() {
		System.out.println("Pets are fun!");
	}
}
 //you can either implement the abstract method in a subclass or make the subclass abstract 

class DogSound_Abs extends PetSound_Abs {
	//in any class that inherits this abstract class, has to implement abstract method in a subclass
	@Override
	public void petSound() {
		System.out.println("Dogs bark.");
	}
}

class CatSound_Abs extends PetSound_Abs {
	@Override
	public void petSound() {
		System.out.println("Cats meow.");
	}
}
//have to implement petsound in turtles or else error 
class TurtleSound_Abs extends PetSound_Abs {
	@Override
	public void petSound() {
		System.out.println("turtles hiss");
	}
}