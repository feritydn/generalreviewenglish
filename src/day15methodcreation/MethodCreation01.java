package day15methodcreation;

public class MethodCreation01 {

	public static void main(String[] args) {
		// values in parentheses are called arguments
		
		// If we do not write collection, nothing will be written to the console.
		// this event is called call method.
		// in this case, it simplifies the main method and improves its legibility.
		// We must put static in a method that will call in main.
		// argument data type must match with the parameter's data type.
		System.out.println(collection (12,15.5)); // 27.5
		System.out.println(product (20,25)); // 500
	}
	
	public static double collection (int num1, double num2) {
		
		return num1 + num2;
	}
	public static int product(int num1, int num2) {
		return num1*num2;
	}
}
