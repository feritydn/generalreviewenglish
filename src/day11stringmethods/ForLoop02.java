package day11stringmethods;

public class ForLoop02 {

	public static void main(String[] args) {
		// Create a for loop that prints numbers less than 100 and multiples of 3
		for (int i = 3; i<100; i+=3) {
			System.out.print(i + " ");
		}
		// Write the program that gives the sum of the first 5 counts with for loop
		System.out.println();
		int sum =0;
		for (int i =1; i<6; i++) {
			sum = sum+i;
		}
		System.out.println(sum);//15
		
		// Write the for loop which gives the sum of the first 3 counts bigger than 10
		int sum1 = 0;
		for (int i =11; i<=13; i++) {
			sum1 = sum1 + i;
		}
		System.out.println(sum1); //36
		
		// Sum from 0 to 100 divided by 5
		int sum2 =0;
		for (int i =5; i<100; i += 5) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
		
		// Write the loop that adds the first five numbers larger than 20.
		int sum3 = 0;
		for (int i =21; i<26; i++) {
			sum3 = sum3+i;
		}
		System.out.println(sum3);
		
		// for loop to the sum of the first 50 counts
		int sum4 = 0;
		for (int i = 1; i<51; i++) {
			sum4 = sum4 + i;
		}
		System.out.println(sum4);
	}

}
