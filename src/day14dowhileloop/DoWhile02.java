package day14dowhileloop;

public class DoWhile02 {

	public static void main(String[] args) {
		// the difference of do loops with while loops
		
		// do while loop runs at least once because it processes first and then checks the condition. 
		// but while if the condition is wrong it won't work.
		
		int num1 =7;
		
		while (num1 <7) { // false
			System.out.println("While: " + num1); //null
			num1++;
		}
		
		int num2 =7;
		
		do {
			System.out.println("Do while: "+ num2); //7
			num2++;
		}while(num2<7);
		
	}


	}

