package wk9_inheritencepolymorphism;

public class Pet_Sounds {

	public static void main(String[] args) {
		/* Implement driver Run_PetSounds, object classes PetSounds, DogSounds, CatSounds, TurtleSounds
		PetSounds has public method  petSounds that prints the sound pets make
		DogSounds extends PetSounds
		CatSounds extends PetSounds
		TurtleSounds extends PetSounds
		Each object class overrides the petSounds method
		*/
		
		PetSounds pet = new PetSounds();
		DogSounds dog = new DogSounds();
		TurtleSounds turtle = new TurtleSounds();
		
		pet.prtSounds();
		dog.prtSounds();
		//if it doesnt find prtSounds in turtle, it defaults to the next bottom layer
		turtle.prtSounds();

	}
}
	class PetSounds {
		public void prtSounds() {
			System.out.println("pets make sounds.");
		}
	}
	
	class DogSounds extends PetSounds {
		public void prtSounds() {
			System.out.println("Dogs bark");
		}
	}
	
	class Catsounds extends PetSounds {
		public void prtSounds() {
			System.out.println("Cats meow");
		}
	}
	
	class TurtleSounds extends PetSounds {
		
	}

