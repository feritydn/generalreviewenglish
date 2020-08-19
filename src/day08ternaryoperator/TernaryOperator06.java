package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator06 {

	public static void main(String[] args) {

		// Get a number from the user
		// If the number is even number, 
		// Print "Wooow 10" if the number is divided by 10,
		// Print "Pity 10" if the number is not divided by 10
		// If the number is odd, check if it is divided by 5.
		// Print "Wooow 5" if the number is divided by 5,
		// Print "Pity 5" if the number is not divided by 5

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter an integer");

		int num = scan.nextInt();
		
		String result = (num %2 ==0)? (num %10 ==0 ? "Wooow 10" :"Pity 10" ) : 
						(num %5 ==0)? "Wooow 5" :"Pity 5";
		System.out.println(result);
		scan.close();

	}

}
