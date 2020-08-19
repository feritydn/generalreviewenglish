package day11stringmethods;

public class StringMethods01 {

	public static void main(String[] args) {
		// startsWith () Checks if a string starts with the desired letter.
		// Returns true if it starts with the desired letter.
		// if it does not, it returns false.

		String str1 = "Ali Can";

		// startsWith () 1. version
		System.out.println(str1.startsWith("A")); // true
		System.out.println(str1.startsWith("B")); // false
		System.out.println(str1.startsWith("a")); // false
		System.out.println(str1.startsWith("Ali"));// true
		// we can look at one letter or more than one letter.

		// statsWith ( ) 2. Version
		System.out.println(str1.startsWith("a", 3)); // false
		System.out.println(str1.startsWith("a", 5)); // true
		System.out.println(str1.startsWith("Can", 4)); // true

		// endsWith () Checks if a string ends with the desired letter.
		// Returns true if it ends with the desired letter.
		// if it does not, it returns false.
		String str2 = "Ayse Canan";
		System.out.println(str2.endsWith("n"));  //true
		System.out.println(str2.endsWith("Canan"));  // true
		System.out.println(str2.endsWith("CANAN"));  // false
		System.out.println(str2.endsWith("")); // true Because there is nothing after the letter n.
		System.out.println(str2.endsWith(" ")); // false because there is no space after the letter n
		
		String str3 = "Ali ";
		System.out.println(str3.endsWith(" ")); // true
		System.out.println(str3.endsWith("")); // true
		System.out.println(str3.startsWith(""));// true

	}

}
