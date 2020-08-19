package day14dowhileloop;

import java.util.Scanner;

public class HQ2 {

	public static void main(String[] args) {
		// Get a number from the user and print the divisors of this number on the screen.
		//For example; The divisors of 12 are 1, 2, 3, 4, 6, 12.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a pozitive integer");
		int num = scan.nextInt();
		
		for (int i =1; i<=num; i++) {
			if (num%i==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		int i =1;
		while (i<=num) {
			if (num%i==0) {
				System.out.print(i + " ");
			
			}
			i++;
		}
scan.close();
	}

}
