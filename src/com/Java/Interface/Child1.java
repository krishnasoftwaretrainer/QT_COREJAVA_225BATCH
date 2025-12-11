package com.Java.Interface;

interface Parent 
{
	 void interestRate1();

}

public class Child1 implements Parent
{
	public void interestRate1()
	{
		System.out.println("Interest Rate is 5%");
	}
	
	public static void main(String[] args) 
	{
		Child1 c1 = new Child1();
		c1.interestRate1();
	}

}
