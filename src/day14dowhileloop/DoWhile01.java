package day14dowhileloop;

public class DoWhile01 {

	public static void main(String[] args) {
		
		// print the first four counts on the screen
		int num =1;
		do{
			System.out.print(num + " ");
			num++;
		}while (num<5);

		// Print odd integers from 10 to 20 with do while loop on the screen
		System.out.println();
		int num1 = 11;
		do {
			System.out.print(num1 + " ");
			num1 += 2;
		}while(num1<=20);
	}

}
