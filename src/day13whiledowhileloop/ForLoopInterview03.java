package day13whiledowhileloop;

import java.util.Scanner;

public class ForLoopInterview03 {

	public static void main(String[] args) {
		// get a number from the user
		// print 2 more of the inverse of this number
		Scanner in = new Scanner (System.in);
		System.out.println("Please enter an integer");
		String num = in.next();
		String reverse = "";
		int lenght = num.length();
		for (int i = lenght-1; i>=0; i--) {
			reverse = reverse +num.charAt(i)+"";
		}		
		int numReverse = Integer.valueOf(reverse);
		numReverse = numReverse+2;
		System.out.println(numReverse);
		in.close();
	}

}
