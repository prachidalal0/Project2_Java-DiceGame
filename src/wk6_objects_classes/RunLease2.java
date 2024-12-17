package wk6_objects_classes;

//"run" driver class
public class RunLease2 {
//drive class is the one with the main method
	public static void main(String[] args) {
		
		/*
		Copy RunLease class to RunLease2 class and change Lease class to Lease2 class
		Add a constructor with a parameter for lessor
		In Lease, declare vars for lessor, rent, deposit, pet
		In Lease, implement method getFirstPayment
		*/

		
		Lease2 lease2 = new Lease2();
		System.out.println(lease2.getFirstPayment());
		
		Lease2 lease2b = new Lease2("Kevin");
		lease2b.pet = true;
		System.out.println("Lease2b: " + lease2b.lessor + " " + lease2b.getFirstPayment());
		

	}
	
}

	class Lease2 { //object class 
	
		//Declare Variables
		String lessor;
		double rent = 1000;
		double deposit = 500; 
		boolean pet = false; 
		
		//no arg Constructor not default constructor
		Lease2 () {}
		
		Lease2(String s) { //Explicit constructor
			lessor = s;
		}
		
		//Method to get first payment
		public double getFirstPayment() {
			double petCost = 200;
			if (pet) {
				return (2 * rent) +  deposit + petCost;
			}
			else {
				return (2 * rent) +  deposit;
			}
				
		}
		
	}	
	

