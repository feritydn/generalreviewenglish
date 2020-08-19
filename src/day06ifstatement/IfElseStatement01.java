package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
		
		// ask the user to enter the Password.
		// If password is correct, "Print password correctly. 
		// If password is wrong" Password is incorrect. try again "
		// Correct password = java2020
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter your password");
		
		String password = scan.nextLine();
		
		//Java created a reference for string
		// also created a reference for the password we wrote
		// neither is the same. The value is the same, but the address is not the same.
		// we will prevent java address checking
		// Delete the double equation and put a dot, then we choose equals.
		// While checking if the strings are equal, we write "equals".
		
		// "==" Checks the address and value of the string.
		// "equals" only checks values
		
		if (password.equalsIgnoreCase("java2020")) {
			System.out.println("Password is correct");
		}else {
			System.out.println("Password is incorrect. Please try again");
		}
		scan.close();

	}

}
