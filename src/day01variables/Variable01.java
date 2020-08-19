package day01variables;

public class Variable01 {

	public static void main(String[] args) {

		int salary = 3000;

		char letter = 'S'; // Single quotes are used for characters
							// \ 0000 for default value characters

		System.out.println(salary); // we see the assigned value, not the salary

		System.out.println(letter); // result changes when value changes

		int num = 123;
		System.out.println(num);

		boolean isOld = true; // For booleans, only True or False is used
		System.out.println(isOld);

		boolean isNew = false;
		System.out.println(isNew);

		byte depth = -128;
		System.out.println(depth); 		// Covers from -128 to 127 and takes up 8 bits of data

		short naziliPopýlation = 2800; // -32000 odd + 32000 odd
		System.out.println(naziliPopýlation);

		long numberOfCell = 4586666654566666l; // java wants to keep a number entered in as an int.
												// If we want to make it long, we should write "l" or "L"at the end of
												// the number.
		System.out.println(numberOfCell);

		double pi = 3.1444423589617; // java automatically accepts all fractional numbers are double
		System.out.println(pi); 	// default value 0.0

		float money = 5.25f; 		// if we want to float a decimal fraction
									// 'f' or 'F' is written.

		System.out.println(money); // default value 0.0f

		String studentName = "Ali Can";
		System.out.println(studentName); // ""don't forget to use

	}

}
