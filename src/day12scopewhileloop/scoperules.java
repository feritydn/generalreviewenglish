package day12scopewhileloop;

public class scoperules {

	public static void main(String[] args) {
		// it shows where we can use a variable we created.
		// If we create a variable inside the class but outside the method, all methods can be reached.
		// 

	}

}

// Rule 1: The variable inside the class but outside the methods, all methods can use
//         as much as they want. These variables are called "Class variable" or "Instence Variable"

//Rule 2: Variables created within the body of a method are only for use of that method.
//        Other methods cannot be used. These variables created in the method are called "Local variable"
//        We have to assign value to Local variabs created in body.java cannot assign them default values.

//Rule 3: Variables created in the parentheses of the methods can only be used within the bodies of those methods.
//        These are called "Local Variable" but there is a difference. DO NOT assign values to local variabs made in parentheses.

//Rule 4: We have to define a variab before we start using it. 