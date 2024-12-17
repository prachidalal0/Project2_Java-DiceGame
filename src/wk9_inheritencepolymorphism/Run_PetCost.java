package wk9_inheritencepolymorphism;

public class Run_PetCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PetCost pet0 = new PetCost();
		PetCost pet1 = new PetCost(500, 200, 10);
		pet1.setTotal();
		
		//constructors are not inherited. have to write the constructor in dogcost 
		//used short cut to basically inherit or invoke petcost in dogcost
		DogCost dog = new DogCost(1000, 500, 12);
		DogCost dog2 = new DogCost(500, 100, 18, "chihuahua");
		
		//getClass prints out 
		System.out.println("pet0: " + pet0.getTotal());
		System.out.println("pet1: " + pet1.getTotal());
		
		System.out.println("dog: " + dog.getTotal());
		System.out.println("dog2: " + dog2.getTotal() + " " + dog2.getBreed());

}
}

class PetCost {
	private double purchase;
	private double maintenance;
	private double lifespan;
	private double total;
	
	PetCost() {}
	
	PetCost(double purchase, double maintenance, double lifespan) {
		this.purchase = purchase;
		this.maintenance = maintenance;
		this.lifespan = lifespan;
	}
	
	public void setTotal() {
		total = purchase + (maintenance * lifespan);
	}
	
	public double getTotal() {
		return total;
	}
	
}

class DogCost extends PetCost {
	String breed;
	
	DogCost(double purchase, double maintenance, double lifespan) {
		//shortcut to use DogCost instead of inheriting it bc you cant inherit it
		super(purchase, maintenance, lifespan); //invokes the PetCost constructor
		//invoke setTotal or else dog value would be 0
		// are only be able invoke setTotal bc of the super shortcut
		setTotal();
	}
	
	DogCost(double purchase, double maintenance, double lifespan, String breed) {
		//constructor statement has to be first, before this.breed
		super(purchase, maintenance, lifespan); //invokes the PetCost constructor
		this.breed = breed;
		setTotal();
	
}
	public String getBreed() {
		return breed;
	}
}
