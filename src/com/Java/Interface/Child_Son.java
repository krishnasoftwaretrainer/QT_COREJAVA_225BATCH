package com.Java.Interface;

interface Parent1 
{
	 void Father1();
}

interface Parent2 
{
	 void Father2();
}
interface Parent3 
{
	 void Father3();
}

public class Child_Son implements Parent1,Parent2,Parent3
{

	public void Father1()
	{
		System.out.println("Father1 Method Implemented");
	}
	public void Father2()
	{
		System.out.println("Father2 Method Implemented");
	}
	public void Father3()
	{
		System.out.println("Father3 Method Implemented");
	}
}
