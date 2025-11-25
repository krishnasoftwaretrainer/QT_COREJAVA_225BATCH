package com.Java.Operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		int a = 10,b=10,c=10,d=10,e=10;
		
		System.out.println(a+=5); // a=15
		System.out.println(b-=5); // 10
		System.out.println(c*=5); // 50
		System.out.println(d/=5); // 2
		System.out.println(e%=5); // 0
		
		int x=10; //Normal Variable 4bytes
		
		System.out.println(x+=5); // x=15
		System.out.println(x-=5); //  x=10
		System.out.println(x*=5); // x=50 
		System.out.println(x/=5); // x=10 
		System.out.println(x%=5); // x=0
	}

}
