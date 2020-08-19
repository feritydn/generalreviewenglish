package day18statickeyword;

public class Static01 {

	static int width = 12;
	static int height = 10;
	static int area; //int area = width *height;
	static int radius =4;
	static double pi;
	
	static {
		area = width*height;
		
		// "Static block" is written outside of all methods and constructors in the class.
	}
	static {
		pi = 3.14;
	}
	public static void main(String[] args) {
		// If we need to calculate when creating a variable, it is good to create a "Static block".
		// "static block" can also be used to assign values to variables
		// It is created when "static block" class is created. It should be at the beginning.
		// "static block" is run before all methods and constructors (including main method)
		// if there is more than one "static block" it will run before written above.

	}
	
	static class innerClass{
		// Static class can be created but inner classes can be static
		// outer classes cannot be static.
	}

}
