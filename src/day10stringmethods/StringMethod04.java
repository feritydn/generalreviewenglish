package day10stringmethods;

public class StringMethod04 {

	public static void main(String[] args) {
		// contains () method checks if a string has the desired Characters. 
		// Returns true if the desired character is present, or false if it is not.
		
		String str1 = "karakartal";
		System.out.println(str1.contains("m")); 
		// even if it is a single letter, we have to make a string.
		System.out.println(str1.contains("kar"));
		
		// trim () method deletes the spaces at the beginning and end of a String.
		// Does not deletes the middle spaces
		String str2 = " Ali Can      ";
		System.out.println("Before using trim: " + str2);
		System.out.println("After using trim: " + str2.trim());
		
		// isEmpty () method checks if a String empty or not.
		// if is empty return true, if not return false
		String str3 = "Ali";
		System.out.println(str3.isEmpty());
		String str4 = "";
		System.out.println(str4.isEmpty());
		

	}

}
