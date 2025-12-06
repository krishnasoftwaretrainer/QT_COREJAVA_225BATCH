package com.Java.Arrays;

import java.util.Scanner;

public class DoubleDimensionArray_Dynamic {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Frist Array Row Size:");
		int frsize=scanner.nextInt();  //3 3*2 
		
		System.out.println("Enter Frist Array Column Size:");
		int fcsize=scanner.nextInt();  //2
		
		//Memory allocation
		int a[][]=new int[frsize][fcsize];
		
		System.out.println("Enter First Array Elements:");
		for(int i=0;i<frsize;i++) // outer loop for rows
		{
			for(int j=0;j<fcsize;j++) // inner loop for columns
			{
				a[i][j]=scanner.nextInt();
			}
		}
		
		//2nd Array
		System.out.println("Enter Second Array Row Size:");
		int srsize=scanner.nextInt();  //3 3*2 
		
		System.out.println("Enter Second Array Column Size:");
		int scsize=scanner.nextInt();  //2
		
		//Memory allocation
		int b[][]=new int[srsize][scsize];
		
		System.out.println("Enter Second Array Elements:");
		for(int i=0;i<srsize;i++) // outer loop for rows
		{
			for(int j=0;j<scsize;j++) // inner loop for columns
			{
				b[i][j]=scanner.nextInt();
			}
		}
			//Printing First Array
		System.out.println("First Array Elements are:");
		for(int i=0;i<frsize;i++) // outer loop for rows
		{
			for(int j=0;j<fcsize;j++) // inner loop for columns
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		//Printing Second Array
		System.out.println("Second Array Elements are:");
		for(int i=0;i<srsize;i++) // outer loop for rows
		{
			for(int j=0;j<scsize;j++) // inner loop for columns
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}

	}

}
