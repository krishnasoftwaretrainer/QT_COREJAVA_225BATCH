package com.Java.Strings;

import java.util.Scanner;

public class String_Methods {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		/*
		//String Length()
		//String str = "Hello Java!"; //11 characters
		//System.out.println("Enter any String:");
		//String str = scanner.nextLine();
		String str=new String("Hello Java!"); //11 characters
		int length=str.length();
		System.out.println("String Length: "+length );
		
		//String toUpperCase()
		String str2 = "Hello Java!";
		System.out.println("Original String: " + str2);
		System.out.println("Upper Case String: " + str2.toUpperCase());
		
		//String LowerCase()
		String str3 = "Hello Java!";
		System.out.println("Original String: " + str3);
		System.out.println("Lower Case String: " + str3.toLowerCase());
	
		//String Trim()
		String str4 = "   Hello Java!   ";
		System.out.println("Before Trim: '" + str4 + "'");
		System.out.println("After Trim: '" + str4.trim() + "'");
		
		//String Replace()
		String str5 = "Jaba";
		System.out.println("Original String: " + str5);
		//System.out.println("After Replace: " + str5.replace('b', 'v'));
		System.out.println("After Replace: " + str5.replace("Jaba", "Selenium"));
	
		//String Concatenation concat()
		String str6 = " Hello";
		String str7 = " Java!";
		System.out.println(str6.concat(str7));
		System.out.println(str7.concat(str6));
		System.out.println(str6.concat(str6));
		System.out.println(str7.concat(str7));
	
		//String empty()
		//String str8 = "";
		String str8 =null;
		System.out.println("Is str8 empty? " + str8.isEmpty());
		System.out.println("Length of str8: " + str8.length());
	*/
		/*
		String str8 ="a";
		if(str8.isEmpty()) //true
		{
			System.out.println("str8 is null");
		}
		else
		{
			
			System.out.println("Length of str8: " + str8.length());
		}
		*/
		/*
		//String equals()
		String str9 = "Java is";
		String str10 = "Java is";
		System.out.println(str9.equals(str10)); //true
		*/
		//String ValueOf()
		String str11 = "Hello Java!";
		String str12 = "";
		System.out.println(str11.valueOf(str11)); //Hello Java!
	
		//CompyyValueOf()
		char[] ch = {'J', 'a', 'v', 'a'};
		String str13 = "";
		System.out.println(str13.copyValueOf(ch)); //Java
	
	
	}

}
