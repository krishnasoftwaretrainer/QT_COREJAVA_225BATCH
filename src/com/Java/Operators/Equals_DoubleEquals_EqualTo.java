package com.Java.Operators;

public class Equals_DoubleEquals_EqualTo {

	public static void main(String[] args) {

		int a=10;
		int b=10;
		
		System.out.println(a==b);  //false true
		//System.out.println(a.eq);   //10
		
		String s1=new String("hello");
		String s2=new String("abcd");
		System.out.println(s1==s2);  //false
		
		System.out.println(s1.equals(s2));  //true
		
	}

}
