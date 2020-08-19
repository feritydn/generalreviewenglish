package day12scopewhileloop;

import java.util.Scanner;

public class HQ2 {

	public static void main(String[] args) {
		// Get the start and end values from the user and from the start value or after
		// Print integers that can be divided by any 3 starting and ending or ending before.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter the starting integer");
		int start = scan.nextInt();
		System.out.println("Please enter the ending integer");
		int end = scan.nextInt();
		
		if (end>start) {
			end = start + end;
			start = end - start;
			end = end - start;
		}
		
		for (int i = end; i<=start; i++) {
			if (i%3==0) {
				System.out.print(i + " ");
			}
		}
		scan.close();
	}

}
