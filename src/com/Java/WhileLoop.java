package com.Java.LoopingStatements;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		/*
		 * while(true) { System.out.println("Good Morning"); }
		 */
		/*
		Scanner scanner = new Scanner(System.in);
		while (true) {

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
		} */
		
		// Print numbers from 1 to 10
		/*
		int i=1;
		while(i<=10) //1<=10 T 2<=10 T...10<=10 T 11<=10 F
		{
			System.out.println(i);
			i++; //i=i+1; //2 3 ... 11
		}
		*/
		//ATM Functionality 
		/*
		int pin=1234;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your PIN:");
		int enteredPin = scanner.nextInt(); //1235
		
		while(enteredPin != pin) //1235 != 1234 T 1234!=1234 F
		{
			System.out.println("Invalid PIN. Please try again.");
			System.out.println("Enter your PIN:");
			enteredPin = scanner.nextInt();
		}
		System.out.println("PIN accepted. You can access your account.");
	*/
		/*
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		*/
		
		int i=1;
		while(i<=5) //6==5 F
			//while(i<=5)
		{
			//System.out.println(i);
			System.out.print(i+"  ");
			i++;
		}
		/*
		while(true)
		{
			System.out.println("Good Morning");
		}*/
	}

}
