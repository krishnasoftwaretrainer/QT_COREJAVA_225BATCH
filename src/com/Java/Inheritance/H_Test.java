package com.Java.Inheritance;

public class H_Test 
{

	public static void main(String[] args) 
	{
		H_Child1 c1 = new H_Child1();
		c1.parentMethod();
		c1.child1Method();
		System.out.println();
		
		H_Child2 c2 = new H_Child2();
		c2.parentMethod();
		c2.child2Method();
		System.out.println();
		
		H_Child3 c3 = new H_Child3();
		c3.parentMethod();
		c3.child3Method();
	}
}
