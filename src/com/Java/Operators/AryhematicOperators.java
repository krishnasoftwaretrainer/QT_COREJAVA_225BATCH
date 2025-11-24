package com.Java.Operators;

import java.util.Scanner;

public class AryhematicOperators {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int a=15,b=5;
		//System.out.println("Enter any Two Values:");
		//int a=scan.nextInt();
		//int b=scan.nextInt();
		int sum=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		int mdiv=a%b;
		
		System.out.println(sum); //30
		System.out.println(sub); //10
		System.out.println(mul); //200
		System.out.println(div); //2
		System.out.println(mdiv); //0
		
		System.out.println(20+10); //30
		System.out.println(20-10); //10
		System.out.println(20*10); //200
		System.out.println(20/10); //2
		System.out.println(20%10); //0
		
		/*
		System.out.println(a+b); //30
		System.out.println(a-b); //10
		System.out.println(a*b); //200
		System.out.println(a/b); //2
		System.out.println(a%b); //0
		*/
		
		
		/*
		System.out.println(5/2); //2
		System.out.println(5%2); //1
		
		System.out.println(2/5); //0
		System.out.println(2%5); //2
		*/

	}

}
