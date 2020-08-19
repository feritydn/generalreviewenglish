package day18statickeyword;

public class ThisKeywords {
	
	int x = 12;
	static int y = 13;
	
	ThisKeywords (int x){
		// When I use this, I want to reach the instance or static variables in the class I am in.
		this("Ali");
		// this(); call the constructor without parameters in this class
		// If "this ()" will be used, it must be written on the first line.
		// otherwise it returns compile time error.
		// "This (" Ali ")" calls the constructor with string parameters in this class.
		
		this.x = x;
		System.out.println("Parameter constructor");
	}
	
	ThisKeywords(){
		System.out.println("Constructor without parameters");
	}
	
	ThisKeywords(String str){
		System.out.println("Constructor with string parameters");
	}

	public static void main(String[] args) {
		
		ThisKeywords obj1 = new ThisKeywords(15);
		System.out.println(obj1.x); // 15

	}

}
