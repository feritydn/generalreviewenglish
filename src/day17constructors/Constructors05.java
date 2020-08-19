package day17constructors;

public class Constructors05 {

	public static void main(String[] args) {
		// Let's print the instance variables in Constructors04
		
		System.out.println("Static: "+Constructors04.num1); //static
		
		Constructors04 obj1 = new Constructors04();
		System.out.println("Non - static: "+obj1.num2); // non - static
		

	}

}
