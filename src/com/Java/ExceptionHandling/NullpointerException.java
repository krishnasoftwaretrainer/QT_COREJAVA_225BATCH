package com.Java.ExceptionHandling;

public class NullpointerException {

	public static void main(String[] args) {

	//String str = null;
	//		String str = "Hello World";
		//System.out.println(str.length());

		try 
		{
			String str = null;
			System.out.println(str.length());
		} 
		
		catch (NullpointerException e) 
		{
			System.out.println("String is Null"+e.getMessage());
			System.out.println("Exception is Accured");
		}

	}

}
