package com.Java.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ArthameticException {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
	
		//System.out.println(10/2);
		//System.out.println(10/0);
		//System.out.println("Program Success");
		
		try 
		{
			System.out.println(10/0);
		}
		
		catch (ArithmeticException e) 
		{
			System.out.println("Unable to dived Somenthing by Zero"+e.getMessage());
			System.out.println("Exception is Accured");
			//System.out.println("You are trying to divide a number by zero");
		}
		
		Thread.sleep(2000);

		FileReader fr = new FileReader("abc.txt");
		
		
		

	}

}
