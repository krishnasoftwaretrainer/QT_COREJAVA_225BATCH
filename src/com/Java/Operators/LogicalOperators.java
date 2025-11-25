package com.Java.Operators;

public class LogicalOperators {

	public static void main(String[] args) {
		
		boolean x = false;
		boolean y = false;

		// Logical AND
		System.out.println("x && y: " + (x && y)); // true false false false

		// Logical OR
		System.out.println("x || y: " + (x || y)); // true true true false

		// Logical NOT
		System.out.println("!x: " + (!x)); // false false true true
		System.out.println("!y: " + (!y)); // false true  false true

		System.out.println("!(x && y)): " + (!(x && y))); // false true true true

	}

}
