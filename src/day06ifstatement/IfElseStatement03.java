package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {

		// Let's get the amount and price of the product to be bought from the user.
		// If the user buys more than 1000 products, write a code that gives
		// 20% discount and writes the total amount that the user will pay.
		// If you buy less than 1000 or 1000 products, do not give a discount.

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the number of products you will buy ");
		int product = scan.nextInt();
		
		System.out.println("Please enter the unit price");
		double price = scan.nextDouble();
		
		if (product>1000) {
			System.out.println((price*80/100)*product);
		}else {
			System.out.println(product*price);
		}
		scan.close();
	}

}
