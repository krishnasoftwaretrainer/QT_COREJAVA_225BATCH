package com.Java.ExceptionHandling;

public class Nullpointer_Exception {

	public static void main(String[] args) {

		try 
		{
			String str = null;
			System.out.println(str.length());
		} 
		catch (NullPointerException e)
		{
			System.out.println("String is Null: " + e.getMessage());
			System.out.println("Exception has Occurred");
		}
		
		try
		{
			System.out.println(10/2);
		}
					
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by zero: " + e.getMessage());
			System.out.println("Exception has Occurred");
		}
		
		System.out.println("Program Success");
		
	}

}
