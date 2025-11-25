package com.Java.Operators;

public class RelationalOperators {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		// Greater than
		System.out.println("a > b: " + (a > b)); // false

		// Less than
		System.out.println("a < b: " + (a < b)); // true

		// Greater than or equal to
		System.out.println("a >= b: " + (a >= b)); // false
					//10 > 20  false 10 = 20 false

		// Less than or equal to
		System.out.println("a <= b: " + (a <= b)); // true
					//10 < 20 true 10 = 20 false	

		// Equal to
		System.out.println("a == b: " + (a == b)); // false
			//10 = 20 false

		// Not equal to
		System.out.println("a != b: " + (a != b)); // true
			//10 != 20 true

	}

}
