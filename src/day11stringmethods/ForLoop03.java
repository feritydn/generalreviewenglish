package day11stringmethods;

public class ForLoop03 {

	public static void main(String[] args) {
		// for loop that gives the product of the first 4 counts
		int product = 1;
		for (int i =1; i<5; i++) {
			product = product*i;
		}
		System.out.println(product);
		
		//Create a for loop that multiplies the first 6 even counts
		int product1 = 1;
		for (int i = 2; i<13; i +=2) {
			product1 = product1*i;
		}
		System.out.println(product1);
		
		// Calling back from mathematics one by one is called factorial
		// this is the interview question.
		// create a for loop that finds 9!
		
		int product2 = 1;
		for(int i=9; i>0; i--) {
			product2 = product2*i;
		}
		System.out.println(product2);
	}

}
