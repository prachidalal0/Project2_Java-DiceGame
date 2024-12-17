package wk9_inheritencepolymorphism;

public class Run_Bugs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Implement driver Run_Bugs, object classes Bugs, Insects, Spiders, Solifugae
		Bugs has protected var int legs, public method prtLegs
		Insects extends Bugs, has setLegs method, overrides prtLegs method
		Spiders extends Bugs, has setLegs method, overrides prtLegs method
		Solifugae extends Spiders, has setLegs method, overrides prtLegs method
		*/
		
		Bugs bugs = new Bugs();
		bugs.prtLegs();

		Insects insects = new Insects();
		insects.prtLegs();
		
		Spiders spiders = new Spiders();
		spiders.prtLegs();
		
		Solifugae solifugae = new Solifugae();
		solifugae.prtLegs();
	}

}

class Bugs {
	protected int legs; 
	
	public void prtLegs() {
		System.out.println("bugs have 6 or 8 legs");
	}
	
}

class Insects extends Bugs {
	
	public void setLegs() {
		legs = 6;
	}
	//override method; same signature name (run the most specific one- bottom of the heirarachy of inheritence) 
	//dynamic binding 
	public void prtLegs() {
		System.out.println("Insects have 6 legs");
	}
}

class Spiders extends Bugs {
	
	public void prtLegs() {
		System.out.println("spiders have 8 legs");
	}
	
}

class Solifugae extends Spiders {
	
	//able to declare bc chained all the way up to insects and bugs
	public void setLegs() {
		legs = 6;
	}
	
	public void prtLegs() {
		System.out.println("Solifugae have 10 legs");
	}
	
}
