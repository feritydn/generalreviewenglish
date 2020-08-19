package day16overloading;

public class Constructor02 {

	public static void main(String[] args) {
		// 1) We can use the object we produce in another class.
		// 2) We can change the properties of the objects, but this change only remains limited to that object.
		// 3) If we want every object to be produced to be changed, we will change the original version.
		
		Constructor01 toyotaCar = new Constructor01();
		System.out.println("Price: " + (toyotaCar.price + 1000));
		System.out.println("Year: " + (toyotaCar.year +2));
		System.out.println("Make: " + toyotaCar.make.replace("Honda", "Toyota"));
		System.out.println("Type: " + toyotaCar.type.replace("Civic", "Corolla"));

	}

}
