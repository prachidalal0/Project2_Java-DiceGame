package wk11_abs_classes_interfaces;

public class Run_PetSoundPM {

	public static void main(String[] args) {

		DogSound dog = new DogSound();
		dog.petSound();
		
		CatSound cat = new CatSound();
		cat.petSound();
		
		TurtleSound turtle = new TurtleSound();
		turtle.petSound();
	}
}
 class PetSound {
	public void petSound() {
		System.out.println("Pets make sounds.");
	}
}

class DogSound extends PetSound {
	public void petSound() {
		System.out.println("Dogs bark.");
	}
}

class CatSound extends PetSound {
	public void petSound() {
		System.out.println("Cats meow.");
	}
}

class TurtleSound extends PetSound {
}