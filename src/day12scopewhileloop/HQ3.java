package day12scopewhileloop;

import java.util.Scanner;

public class HQ3 {

	public static void main(String[] args) {
		// Get the start and end letters from the user and get the initial letter
		//Print all the letters that start and end in the end letter in capital letters.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter start letter");
		char lt1 = scan.next().toUpperCase().charAt(0);
		System.out.println("Please enter last letter");
		char lt2 = scan.next().toUpperCase().charAt(0);
		
		if (lt1>lt2) {
			System.out.println("The initial letter cannot be small");
		}
		if ((lt1>='a'&& lt2<='z') && (lt1>='A'&& lt2<='Z')) {
		for (char i =lt1; i<=lt2; i++) {
			System.out.print(i + " ");
		}
		}else {
			System.out.println("Beginning and ending value must be letters");
		}
		scan.close();
	}

}
