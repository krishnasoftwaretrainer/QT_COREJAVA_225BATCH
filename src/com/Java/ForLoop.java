package com.Java.LoopingStatements;

import java.util.Scanner;

public class ForLoop 
{

	public static void main(String[] args) 
	{
		/*
		 * for(int i=1; i<=10; i++) { System.out.println("Good Morning"); }
		 */
		// Print numbers from 1 to 10
		
		//  for(int i=1;i<=10;i++) 
		//  { 
			  //System.out.println(i);
			//  System.out.print(i+" ");
		  //}
		
		// Print 10 to 1
		/*
		 * for(int i=10;i>=1;i--) { System.out.println(i); }
		 */
		// Print even numbers from 1 to 20
		/*
		 * for(int i=2;i<=20;i+=2) //2<=20 4<=20.. 20<=20 22<=20F {
		 * System.out.println(i); }
		 */
		/*
		 * for(int i=2;i<=20;i+=3) //2<=20 4<=20.. 20<=20 22<=20F {
		 * System.out.println(i); }
		 */
		// Even or Odd Numbers from 1 to 20
		//int i = 11;
		//for (int i = 2; i <= 20; i+=2)
		/*
		int i=1;
		while(true) 
		{
				
		if (i % 2 == 0) {
			System.out.println(i + " is Even Number");
		} 
		else {
			System.out.println(i + " is Odd Number");
		}
		*/
		//Print 2 Table
		/*
		for(int i=1;i<=10;i++)
		{
			//System.out.println(i +" * 2 = "+(i*2));
			System.out.println("5 * "+ i +"= " +(i*5));
	} */
		Scanner scanner = new Scanner(System.in);
		
		/*for(int i=1;i<=5;i++)
		{
			
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
		}
		*/
		/*
		for(int i=1;i<=10;i++)
		{
					System.out.println(i);
		}
		*/
		for(int i=11;i>=10;i++)
		{
					System.out.println(i);
		}
		
	}
}
