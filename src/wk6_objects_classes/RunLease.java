package wk6_objects_classes;

//"run" driver class
public class RunLease {
//drive class is the one with the main method
	public static void main(String[] args) {
		/*
		Implement a Java class, RunLease with a main method
		Add a second class to the .java file, Lease
		In Lease, declare vars for lessor, rent, deposit, pet
		In Lease, implement method getFirstPayment
		*/
		
		Lease lease1 = new Lease();
		System.out.println(lease1.getFirstPayment());

	}
	
}

	class Lease { //object class 
	
		//Declare Variables
		String lessor;
		double rent = 1000;
		double deposit = 500; 
		boolean pet = false; 
		
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
	

