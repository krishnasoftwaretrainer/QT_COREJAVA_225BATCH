package com.Java.ConditionalStatements;

import java.util.Scanner;

public class BiggestOf2 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		
		if(a > b) //T F
		{
			System.out.println(a + " is biggest"); //TBS 
		}
		else
		{
			System.out.println(b + " is biggest"); //FBS
		}
	}
}
