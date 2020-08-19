package day13whiledowhileloop;

public class Whileloop02 {

	public static void main(String[] args) {
		// Write the program that prints the product of the first five counts on the screen
		int product =1;
		int num = 1;
		while (num<6) {
			product = product*num;
			num++;
		}
		System.out.println(product); //120
	}

}
