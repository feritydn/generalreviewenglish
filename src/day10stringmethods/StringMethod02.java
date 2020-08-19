package day10stringmethods;

public class StringMethod02 {

	public static void main(String[] args) {
		// The LastIndexOf () method returns the index of the last look in 
		// the string of the character we are looking for.
		
		//LastIndexOf ( ) method 1. version
		String str1 = "Sivrihisar";
		System.out.println(str1.lastIndexOf('i'));
		// prints six on the screen. Because it finds 
		// the last i and the last i is index return 6.
		System.out.println(str1.lastIndexOf('r')); //9
		
		//LastIndexOf ( ) method 2. version
		System.out.println(str1.lastIndexOf('i', 7));//6
		// returns the letter 'i' in the first 7 indexes of the index (Including 7)
		System.out.println(str1.lastIndexOf('i', 5)); //4
		
		//LastIndexOf ( ) method 3. version
		String str2 = "rivrihisari";
		System.out.println(str2.lastIndexOf("ri")); //9
		// will find the view of the last "ri" in the string and return the index of the 
		// r letter of the last "ri".
	}

}
