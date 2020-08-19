package day16overloading;

public class Overloading01 {// overloading Turkish means "asiri yukleme"

	public static void main(String[] args) {
		// Create a method that prints the sum of two numbers on the screen
		
		sum (2,3);      // Method 1 
        sum (14,15,10); // Method 2 
        sum (2.3,3);    // Method 3
        sum (5,4.1);    // Method 4
        
     // It was not enough to change the body part of the method.
     // 					Ways to Overload
        
     // 1.) By changing the number of parameters, we can create methods with the same name.
     // 2.) We can create the same named methods by changing the data type of any parameter without changing the number of parameters.
     // NOTE: sum (2,3) call returns int if both data types are int. If not, it will choose double.
     // 3.) We can create methods with the same name by changing the location of the parameters in the DIFFERENT data type.
     }
	// Method 1
	public static void sum(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	// Method 2
	public static void sum(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}
	// Method 3
	public static void sum(double num1, int num2) {
		System.out.println(num1 + num2);
	}
	// Method 4
	public static void sum(int num2, double num1) {
		System.out.println(num1 + num2);
	}
}
