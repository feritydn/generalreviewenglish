package day10stringmethods;

public class StringMethod01 {

	public static void main(String[] args) {
		
		// indexOf () method is used to locate the character in String.
		
		// indexOf() method 1. version
		String str1 = "Javva World";
		System.out.println(str1.indexOf('v'));
		// Gives 2 to the screen because index count starts from 0
		System.out.println(str1.indexOf('W'));
		// prints five on the screen because space is a character.
		System.out.println(str1.indexOf('w'));
		// Java cannot find index because java case sensitive.
		// java returns -1 for a non-index character.
		System.out.println(str1.indexOf('a'));
		// there are two a finds the first one. and it doesn't continue.
		// Works from left to right
		
		// indexOf() method 2. version
		
		System.out.println(str1.indexOf('a',3));
		// find the second index of a character in String
		// 3 v means index 3 then find a
		// does not research after 3, including 3 research.
		
		System.out.println(str1.indexOf('a',4));
		System.out.println(str1.indexOf('a',1)); // 1 print.
		System.out.println(str1.indexOf('a',5)); 
		// prints out -1. because there is a string in string, it is not where we are looking
		
		// Find the index of the second 'a' character from "Alamanya" String.
		String str2 = "Alamanya";
		int idx = str2.indexOf('a');
		System.out.println(idx);
		System.out.println(str2.indexOf('a', idx+1));
		
		// indexOf ( ) method 3. version
		String str3 = "Missisippi"; 
		System.out.println(str3.indexOf("is"));
		// "is" returns the index of the first letter of the first one
		// In this example, it returns 1 which is the index of the letter "i" in the first "is".
	}

}
