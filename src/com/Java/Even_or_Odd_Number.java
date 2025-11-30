package com.Java.ConditionalStatements;

import java.util.Scanner;

public class Even_or_Odd_Number {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		/*
		if (number % 2 == 0) {
			System.out.println(number + " is an Even Number");
		} else {
			System.out.println(number + " is an Odd Number");
		}
		*/
		if (number % 2 == 1) {
			System.out.println(number + " is an Odd Number");
		} else {
			
			System.out.println(number + " is an Even Number");
		}

	}

}
