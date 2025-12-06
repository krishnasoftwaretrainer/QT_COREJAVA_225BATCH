package com.Java.Arrays;

import java.util.Scanner;

public class SingleDimensionArray_Dynamic {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Size of Array:");
		int size=scanner.nextInt();
		//Memory allocation
		//int arr[]=new int[Size]; 
		
		int a[]=new int[size];
				
		System.out.println("Enter Array Elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scanner.nextInt();
		}
		System.out.println("Array Elements are:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
