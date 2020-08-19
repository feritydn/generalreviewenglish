package day11stringmethods;

public class StringMethods02 {

	public static void main(String[] args) {
		// substring () method is used to cut out a part from string
		String str1 = "Java calisana kolaydir";
		
		// subsitring () 1. version
		System.out.println(str1.substring(5));
		// shows 5 index. Not length. Including five cuts.
		System.out.println(str1.substring(8));
		// isana kolaydir (Inclusive)
		System.out.println(str1.substring(22));
		// gives nothing because index 21 ends.
		//System.out.println(str1.substring(23));
		// there is no index 23 but I want to cut it out of 23 this is a mistake.
		// If we write 1 more than the index number of the string, 
		//we get the screen output as "nothing".
		// If we write 2 or more, we get "exception" as the screen output.
		System.out.println(str1.substring(0));
		// it doesn't make sense to use it because it is the same as str1
		
		// substring 2. version
		System.out.println(str1.substring(5,13));
		// including the first index, not including the second index. [5,13)
		System.out.println(str1.substring(6,12));
		System.out.println(str1.substring(6,6));
		// we can't see anything on the screen
		System.out.println(str1.substring(3,6));
		// gives the exception if we write the first number larger.
	}

}
