package day14dowhileloop;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
		// Get a String from user
		// Print the characters of this string which are the odd numbers in the index.
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a sentence or a word. Get more than one letter");
		String str = scan.nextLine();
		int lenght =str.length();
		
		for (int i =1; i<=lenght-1; i+=2) {
			System.out.print(str.charAt(i) + " "); //e i  y i
		}
		System.out.println();
		int i=0;
		do {
			if(i%2==1) {
				System.out.print(str.charAt(i) + " ");
			}
			i++;
		}while (i<lenght);
		scan.close();
	}

}
