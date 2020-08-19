package day16overloading;

import java.util.Scanner;

public class HQ1 {

	public static void main(String[] args) {
		// Write a code that adds the numbers of the number entered by the user
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter an integer");
		int num = sc.nextInt();
		int sum =0;
		while (num !=0) {
			sum = sum + num%10;
			num = num/10;
		}
		System.out.println(sum);
		sc.close();
	}

}
