package day07nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		// Ask the user to enter their password
		// If the password is 4 digits and even numbers, print "Correct Password" on the screen.
		// If the password is 4 digits and odd, print "Incorrect Password" on the screen.
		// Otherwise, print "Try again" on the screen.
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter password");
		
		int num = scan.nextInt();
		
		if (num>999 && num<10000) {
			if (num%2==0) {
				System.out.println("Correct Password");
			}else {
				System.out.println("Incorrect Password");
			}
			
		}else if (num%2 !=0){
			System.out.println("Try again");
		}
		scan.close();
	}

}
