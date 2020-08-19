package day04operators;

public class InterviewQuestion {

	public static void main(String[] args) {
		// Change the values of two variables
		// num1 = 12, num2= 30; we will write code and 
		// will be num1 = 30 and num2=12 (SWAP)
		
		// Useing temp
		
		int num1=30;
		int num2 = 12;
		int temp = 0;
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println(num1);
		System.out.println(num2);
		
		// without useing temp
		
		int num3 = 5;
		int num4 = 10;
		
		num3 = num3 + num4;
		num4 = num3 - num4;
		num3 = num3 - num4;
		System.out.println(num3); //10
		System.out.println(num4); //5
		

	}

}
