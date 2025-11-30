package com.Java.ConditionalStatements;

import java.util.Scanner;

public class Simple_if 
{

	public static void main(String[] args) 
	{
		/*
		Scanner sc=new Scanner(System.in);
		// Student Result:Pass	or Fail
		System.out.println("Enter Student Marks:");
		int marks=sc.nextInt();
		
		if(marks>=35) //50>=35 true 20>=35 false
		{
			System.out.println("Student is Pass");
			//TBS 
		}
		*/
		String username="standard_user";
		String password="secretsauce";
		//validating username and password
		
		if(username.equals("standard_user") && password.equals("secret_sauce"))
		{
			System.out.println("Login Successful");
			//TBS
		}
		
	}

}
