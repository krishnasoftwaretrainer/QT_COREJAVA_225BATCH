package com.Java.ConditionalStatements;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// Student Result:Pass	or Fail
		System.out.println("Enter Student Marks:");
		int marks=sc.nextInt();
		
		if(marks>=35) //50>=35 true 20>=35 false
		{
			System.out.println("Student is Pass");
			//TBS 
		}
		else
		{
			System.out.println("Student is Fail");
			//FBS
		}

	}

}
