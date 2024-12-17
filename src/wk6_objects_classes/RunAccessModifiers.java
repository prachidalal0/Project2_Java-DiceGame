package wk6_objects_classes;

public class RunAccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Implement a class, RunAccessModifiers, with another class in the same .java file, Access Modifiers
		Make AccessModifiers class default and RunAccessModifier class public
		In AccessModifier class, declare int x, y, and z, where z = x + y
		In driver class, instantiate AccessModifiers and assign 10, 20 to x, y, – then print the equation
		*/

		AccessModifiers am = new AccessModifiers(); // Used default constructor
		
		//am.x = 10;
		//invokes setter method for X, assigns value of 10 
		am.setX(10);
		//am.y = 20;
		am.setY(20);
		//am.setZ();
		am.setZ();
		
		System.out.println(am.getX + " + " am.getY + " = " + am.getZ);
		
	}

} // End of Driver class

class AccessModifiers {
	
	// DeclareVars
	private int x;
	private int y;
	private int z;
	
	
	//methods
	public void setZ() { 
		z = x + y;
	}
	
	public void setX (int x) {
		//
		this.x = x;
	}
	
	//not void bc returning x
	public int getX () {
		return x;
	}
	
	public void setY (int y) {
		//
		this.y = y;
	}
	
	public int getY () {
		return y;
	}
	
	public void setZ (int z) {
		//
		this.z = z;
}
	public int getZ () {
		return z;
	}
	
}