package com.Java.ExceptionHandling;

public class ArrayIndexOutofBound
{

	public static void main(String[] args) 
	{
		/*
		int arr[]= {10,20,30,40,50};
		
	for(int i=0;i<6;i++)
	{
		System.out.println(arr[i]);
	}
	*/
		
		System.out.println("Program Started");
		try 
		{
		int arr[]= {10,20,30,40,50};
			
		for(int i=0;i<6;i++)
		{
			System.out.println(arr[i]);
		}
		}
		
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Array Index is Out of Bound"+e.getMessage());
			System.out.println("Exception is Accured");
		}
		
		System.out.println("Program Success");
	}
}
