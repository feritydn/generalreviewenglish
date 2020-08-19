package day17constructors;

public class Constructors02 {

	public static void main(String[] args) {
		// growing method is not in this class. In the Constructor 01 class. 
		// so java doesn't allow me to use it.
		
		// If you want to use the method in another class
		// You can create an object from that class and use the object you want on that method.
		
		// We can call a static method without creating an object using only the class name.
		
		Constructors01 obj1 = new Constructors01();
		// obj1.growing(35); Its not true
		Constructors01.growing(35); // Thats true
		Constructors01.newName("Kemal Can");
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		
		// If a variable or method is created as static, we can only access it using the class name 
		// without creating an object in that variable or method.
		Constructors03.age(45);
		Constructors03.name("Obama");

	}

}
