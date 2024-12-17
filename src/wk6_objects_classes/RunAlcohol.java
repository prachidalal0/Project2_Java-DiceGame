package wk6_objects_classes;

public class RunAlcohol {

	public static void main(String[] args) {
		
		/*
		Implement a .java file with class RunAlcohol and class Alcohol
		In Alcohol, declare boolean isOfAge
		In Alcohol, implement method isOfAge(int age) that returns true if customer is age 21+
		In RunAlcohol, instantiate Alcohol and implement logic to sell beer if customer is of age 
		*/
		
		Alcohol beer = new Alcohol();
		
		//beer.isOfAge = true; can't do this, need setter method (need to go through the method) - private 
		
		if (beer.sellAlcohol(25)) {
			//ring up the beer
			
		}
		
		else {
			System.out.println("Not of Age. No Sale.");
		}
		
		

	}

}

class Alcohol {
	
	//can't equate to a number literal, have to use setter method bc private
	private boolean isOfAge = false; 
	
	public boolean sellAlcohol(int age) { 
		if (age >= 21) {
			isOfAge = true; 
		}
		else {
			isOfAge = false;
		}
		return isOfAge;
	}
	
}
