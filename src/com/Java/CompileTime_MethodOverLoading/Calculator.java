package com.Java.CompileTime_MethodOverLoading;

public class Calculator 
{
		// Method to add two integers
	//Number of Parameters 
	/*
	public void Addition(int a, int b) 
	{
		System.out.println("Sum of two integers: " + (a + b));
	}

	public void Addition(int a, int b,int c) 
	{
		System.out.println("Sum of two integers: " + (a + b + c));
	}
	public void Addition(int a, int b,int c,int d) 
	{
		System.out.println("Sum of two integers: " + (a + b + c + d));
	}
	*/
	//Different Data Types
	/*
	public void Addition(int a, int b) 
	{
		System.out.println("Sum of two integers: " + (a + b));
	}

	public void Addition(double a, double b) 
	{
		System.out.println("Sum of two integers: " + (a + b));
	}
	*/
	//Interchange  of DataTypes
	
	public void Addition(int a, double b) 
	{
		System.out.println("Sum of two integers: " + (a + b));
	}

	public void Addition(double a, int b) 
	{
		System.out.println("Sum of two integers: " + (a + b));
	}
	
	public static void main(String[] args)
	{
		Calculator cal=new Calculator();
		//cal.Addition(10, 20);
		//cal.Addition(10, 20, 30);
		//cal.Addition(10, 20, 30, 40);
		//cal.Addition(10, 20);
		//cal.Addition(10.5, 20.5);
		
		cal.Addition(10, 20.5);
		cal.Addition(10.5, 20);
	}
}
