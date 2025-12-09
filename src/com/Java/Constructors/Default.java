package com.Java.Constructors;

public class Default 
{

	 String name="John Doe";
	 int age;
	 double salary;
	 boolean isActive;
	 char grade;
	
	public static void main(String[] args) 
	{
		Default obj = new Default();
		System.out.println("Name: " + obj.name);
		System.out.println("Age: " + obj.age);
		System.out.println("Salary: " + obj.salary);
		System.out.println("Is Active: " + obj.isActive);
		System.out.println("Grade: " + obj.grade);
	}
}
