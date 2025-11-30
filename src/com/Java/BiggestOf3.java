package com.Java.ConditionalStatements;

import java.util.Scanner;

public class BiggestOf3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		System.out.println("Enter third number: ");
		int c = sc.nextInt();
		
		if(a > b)   //T F 30>20 && 30>10 T && T = T F T T F F F
		{
			if (a > c)
			{
			//System.out.println(a + " is biggest"); //TBS 
				System.out.println( "A is big"); //TBS
		}
			else
			{
			//System.out.println(c + " is biggest"); //FBS
				System.out.println("C is big"); //FBS
			}
		}
		else if(b > c) //T F
		{
			//System.out.println(b + " is biggest"); //TBS 
			System.out.println("B is big"); //TBS
		}
		
		else
		{
			//System.out.println(c + " is biggest"); //FBS
			System.out.println("C is big"); //FBS
		}

	}
	}


