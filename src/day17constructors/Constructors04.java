package day17constructors;

public class Constructors04 {
	static int num1 = 35;
	int num2 = 30;
	public static void main(String[] args) {
		num1++;
		// num2++; if you remove the comment num2 ++; Returns java compile time error.
		
		// Only static elements can be used in static methods.
		// num2 is not static and cannot be used in the main method.
		// num1 is static, it is not a problem to use it in the main method.

	}

}
