package wk9_inheritencepolymorphism;

public class Run_YZ {

	public static void main(String[] args) {

		/*  Implement driver class Run_YZ and object classes Y and Z in a single .java file
		Class Z:
		Protected int vars z1, z2
		Methods setZ1, and prtZ to print vars z1, z2 on the same line
		Classy Y:
			Extends (inherits) class Z
			Method setZ2, where z2 = z1 * 2;
		Driver:
			Instantiate a Y object objY
			Invoke setZ1(10), setZ2, and prtZ
		*/	
		
		//instantiate y object
		Y objY = new Y();
		objY.setZ1(10);
		objY.setZ2();
		
		objY.prtZ();
	}

}
//y is the subclass of z 
class Y extends Z{
	//in class Y using variables from class Z (bc of "extends") 
	//term protected, don't have to ^ do this through a method 
	public void setZ2() {
		z2 = z1 * 2;
	}
}

class Z {
	//subclasses can access superclasses variables without having to use methods
	protected int z1;
	protected int z2;
	
	
	//methods
	public void setZ1(int z) {
		z1 = z;
	}
	
	//variables available bc in same class
	public void prtZ() {
		System.out.println("z1: " + z1 + "  z2: " + z2);
	}
	
}
