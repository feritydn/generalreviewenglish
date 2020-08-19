package day11stringmethods;

public class StringMethods04 {

	public static void main(String[] args) {
		// valueOf () method converts strings formed by numbers into numbers.
		// This allows us to do mathematical operations with Strings created with
		// numbers.
		// valueOf exists in both Integer wrapper class and String.
		// The valueOf method inside the Integer wrapper class converts the String to
		// Integer.
		// ValueOf method in string Convert Integer to String.

		String moneyMan = "1900";
		String moneyWoman = "2000";
		// Find the total salary of this family.
		System.out.println(Integer.valueOf(moneyWoman) + Integer.valueOf(moneyMan));
		
		int salaryMan = 1900;
		int salaryWoman = 2000;
		// Convert salaryMan and salaryman numbers to Stringe and concatenation.
		System.out.println(String.valueOf(salaryMan) + String.valueOf(salaryWoman));
	}

}
