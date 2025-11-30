package com.Java.ConditionalStatements;

import java.util.Scanner;

public class StudentResult_Grades 
{

	public static void main(String[] args) 
	{
		//  A>=85 B>=75 C>=55 D>35 Fail
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the student's marks: ");
		int marks = scanner.nextInt();
		
		if (marks >= 85 && marks <= 100) 
			//101>=85 && 101<=100 True && False = False
		{
			System.out.println("Grade: A");
			
		} 
		
		else if (marks >= 75 && marks <85)  //101>=75 True
		{
			System.out.println("Grade: B");
		}
		
		else if (marks >= 55 && marks < 75) 
		{
			System.out.println("Grade: C");
		}
		
		else if (marks >=35 && marks < 55)
		{
			System.out.println("Grade: D");
		}
		else if (marks >=0 && marks < 35)
		{
			System.out.println("Grade: Fail");
		}
		else
		{
			System.out.println("Invalid Marks");
		}

		scanner.close();
	}

}
