package day14dowhileloop;

import java.util.Scanner;

public class DoWhile05 {

	public static void main(String[] args) {
		// Get the name from the user if the first letter is capital "You have entered correctly" 
		// first letter is small "Enter the first letter as capital"
		
		Scanner scan = new Scanner(System.in);
		
		String name = "";
		do {
			System.out.println("Please enter your first name");
			name = scan.next();
			if ((name.charAt(0))>= 'A' && (name.charAt(0))<= 'Z') {
				System.out.println("You have entered correctly" );
			}else {
				System.out.println("Enter the first letter as capital");
			}
		}while (!(name.charAt(0)>= 'A' && name.charAt(0)<='Z'));
		scan.close();
		

	}

}
