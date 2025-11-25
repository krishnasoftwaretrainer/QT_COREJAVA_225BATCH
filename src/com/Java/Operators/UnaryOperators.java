package com.Java.Operators;

public class UnaryOperators {

	public static void main(String[] args) {
		/*
			int a=10;
			int b=-10;
			int c=-b;
			System.out.println(a); //10
			System.out.println(b); //10
			System.out.println(c); //10
			*/
		/*
		int a=10,b=10,c=10,d=10;
		
		System.out.println(++a); //11 
		System.out.println("a: "+a); //11
		System.out.println(b++); //10
		System.out.println("b: "+b); //11
		System.out.println(--c); //9
		System.out.println("c: "+c); //9
		System.out.println(d--); //10
		System.out.println("d: "+d); //9
		*/
		int a=10;
		System.out.println("Staring a Value: "+a); //10
		
		System.out.println(++a); //11 
		System.out.println("a: "+a); //11
		
		System.out.println(a++); //11
		System.out.println("a: "+a); //12
		
		System.out.println(--a); //11
		System.out.println("a: "+a); //11
		
		System.out.println(a--); //11
		System.out.println("a: "+a); //10
		
		System.out.println("Ending a Value: "+a); //10
		
	}

}
