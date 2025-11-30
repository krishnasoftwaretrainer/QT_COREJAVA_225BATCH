package com.Java.ConditionalStatements;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// Blood Donation
		// Age>=18 and Weight>=40kg T T

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = scanner.nextInt();
		

		if (age >= 18) // T Outer
		{
			System.out.println("Enter your weight in kg:");
			int weight = scanner.nextInt();
			
			if (weight >= 40) // T Inner
			{
				System.out.println("You are eligible for blood donation.");
			} else // Inner
			{
				System.out.println("You are not eligible for blood donation due to insufficient weight.");
			}
		} else // Outer
		{
			System.out.println("You are not eligible for blood donation due to age.");
		}

		/*
		 * if(age>=18 && weight>=40) {
		 * System.out.println("You are eligible for blood donation."); } else {
		 * System.out.println("You are not eligible for blood donation."); }
		 */

		scanner.close();
	}

}
