package com.Java.ConditionalStatements;

import java.util.Scanner;

public class Switch_Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any two numbers: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.println("CALCULATOR");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modulus Division");
		System.out.println("Choose your option");
		byte option = scanner.nextByte();
		
		switch (option) 
		{
		
		case 1:
		{
			int sum = num1 + num2;
			//int num3 = num1 + num2;
			System.out.println("Addition: " +sum);
			break;
		}
		case 2:
		{
			int sub=num1 - num2;
			
			System.out.println("Subtraction: " + sub);
			break;
		}
		case 3:
		{
			int mul=num1 * num2;
		
			System.out.println("Multiplication: " + mul);
			break;
		}
		case 4:
		{
			int div=num1 / num2;
				System.out.println("Division: " + div);
				break;
		}
		case 5:
		{
			int mod=num1 % num2;
		
				System.out.println("Modulus Division: " + mod);
		break;
		}
			
	default:
		{
			System.out.println("Invalid Option");
		}
	}

	}
}
	
