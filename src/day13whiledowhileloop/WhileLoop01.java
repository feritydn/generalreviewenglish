package day13whiledowhileloop;

public class WhileLoop01 {

	public static void main(String[] args) {
		// Write the program that displays the sum of the first 5 counts using the while loop.
		int sum =0;
		int num =1;
		while (num<6) {
			sum= num+sum;
			num++;
		}
		System.out.println(sum);//15
	}

}
