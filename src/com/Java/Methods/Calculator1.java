package com.Java.Methods;

public class Calculator1 
{
		//Method-1 Non-Static Method 
	//WithOut Returntype and WithOut Parameters
	public void Addition()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition is: "+c);
	}
	//Method-2 Static Method 
	private static void Subtraction()
	{
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println("Subtraction is: "+c);
	}
	//Method-3 Non-Static Method
	protected void Multiplication()
	{
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println("Multiplication is: "+c);
	}
	
	//Method-4 Static Method
	 static void Division()
	{
		int a=20;
		int b=10;
		int c=a/b;
		System.out.println("Division is: "+c);
	}
	public static void main(String[] args) 
	{
		//ClassName objectName = new ClassName();
		Calculator1 calc = new Calculator1();
		calc.Addition(); //Same Package and Same Class 
		Calculator1.Subtraction();
		calc.Multiplication();
		Calculator1.Division();
		//Calculator1.addition();
		//calc.Subtraction();
		
	}
}
