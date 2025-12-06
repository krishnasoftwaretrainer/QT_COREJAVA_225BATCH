package com.Java.Strings;

import java.util.Scanner;

public class StringLiteral_NewKeyword {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		/*
		String str1 = "Java is"; // String literal
		String str2 = "Java is"; // String literal
		
	//	System.out.println(str1 == str2); //true
		System.out.println(str1.equals(str2)); //true
		
		String str3 = new String("Java is"); // String object
		String str4 = new String("Java is"); // String object
		//System.out.println(str3 == str4); //false
		System.out.println(str3.equals(str4)); //true
	*/
		/*
		System.out.println("Enter first string:");
		//String str1 = scanner.next(); // Input from user
		String str1 = scanner.nextLine(); // Input from user
		System.out.println(str1);
		*/
		System.out.println("Enter any Char Value:");
		char ch = scanner.next().charAt(0); 
		System.out.println("You entered: " + ch);
		
		scanner.close();
	}

}
