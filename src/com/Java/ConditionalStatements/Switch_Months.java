package com.Java.ConditionalStatements;

import java.util.Scanner;

public class Switch_Months {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		System.out.println("Enter month name: ");
		String month = scanner.nextLine().toLowerCase();

		switch (month) {
		
		case "january":
		
			System.out.println("First month of the year");
			break;
		case "february":
			System.out.println("Second month of the year");
			break;
		case "march":
			System.out.println("Third month of the year");
			break;
		case "april":
			System.out.println("Fourth month of the year");
			break;
		case "may":
			System.out.println("Fifth month of the year");
			break;
		case "june":
			System.out.println("Sixth month of the year");
			break;
		case "july":
			System.out.println("Seventh month of the year");
			break;
		case "august":
			System.out.println("Eighth month of the year");
			break;
		case "september":
			System.out.println("Ninth month of the year");
			break;
		case "october":
			System.out.println("Tenth month of the year");
			break;
		case "november":
			System.out.println("Eleventh month of the year");
			break;
		case "december":
			System.out.println("Twelfth month of the year");
			break;
			default:
				System.out.println("Invalid month name");
		} */
		
		System.out.println("Enter month name: ");
		char month= scanner.next().toUpperCase().charAt(0);

		switch (month) {
		
		case 'J':
					System.out.println("First month of the year");
			break;
		case 'F':
			System.out.println("Second month of the year");
			break;
		case 'M':
			System.out.println("Third month of the year");
			break;
		case 'A':
			System.out.println("Fourth month of the year");
			break;
		case 'Y':
			System.out.println("Fifth month of the year");
			break;
		case 'U':
			System.out.println("Sixth month of the year");
			break;
		case 'L':
			System.out.println("Seventh month of the year");
			break;
		case 'G':
			System.out.println("Eighth month of the year");
			break;
		case 'S':
			System.out.println("Ninth month of the year");
			break;
		case 'O':
			System.out.println("Tenth month of the year");
			break;
		case 'N':
			System.out.println("Eleventh month of the year");
			break;
		case 'D':
			System.out.println("Twelfth month of the year");
			break;
			default:
				System.out.println("Invalid month name");
		}


	}

}
