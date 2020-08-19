package day16overloading;

public class Constructor01 {

	int price = 20000;
	int year = 2020;
	String make = "Honda";
	String type = "Civic";
	public static void main(String[] args) {
		
		// What makes an object using Class is called constructor.
		// constructor is not a method, is not a variable ise a code block to
		// create objects from a class.
		
		// 1 ) Constructor is inside the class
		// 2) constructor has the same name with the class
		// 3) Constructor has no return type
		
		// When we create a class, it creates a constructor with java class.
		// We can use it directly without writing any code. This constructor 
		// is called the default constructor. These default constructors have no parameters
		// It is created by java when we create any java classes. 
		// java destroys the default constructor when we create a constructor ourselves.

		Constructor01 hondaCar = new Constructor01();
		System.out.println("price: " + hondaCar.price);
		System.out.println("year: " + hondaCar.year);
		System.out.println("make: " +  hondaCar.make);
		System.out.println("type: " + hondaCar.type);
	}
	
	
	

}
