package com.Java.Constructors;

public class Parameterized 
{

	public Parameterized(String name, int age)
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
	public static void main(String[] args) 
	{
		Parameterized obj1 = new Parameterized("Alice", 30);
		Parameterized obj2 = new Parameterized("Krishna", 20);
		
	}
}
