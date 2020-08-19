package day09switchoperator;

import java.util.Scanner;

public class TernaryHomeworkQuestion {

	public static void main(String[] args) {
		// Ask the user to enter an integer, if that integer is 3 digits, print "3 Digits" on the screen.
		// Check  if it is not 3 digits. If it is even, print "Even number without 3 digits".
		// If not an even number, "Odd number without 3 digits."
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter an integer");
		int num = scan.nextInt();
		
		String result = (num>99 && num<1000)? "3 Digits" : (num%2 ==0 ? "Even number without 3 digits" :"Odd number without 3 digits");
		System.out.println(result);
		scan.close();

	}

}
