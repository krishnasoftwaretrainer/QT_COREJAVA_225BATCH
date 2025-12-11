package com.Java.basicPrograms;

public class WR_WP 
{
	public int Addition(int a, int b,int c) 
	{
		int sum = a + b+ c;
		
		return sum;
	}
	
	public static void main(String args[])
	{
		WR_WP wrwp=new WR_WP();
		System.out.println("Addition is: " +wrwp.Addition(10, 20, 30));
		System.out.println("Addition is: " +wrwp.Addition(100, 200, 300));
	
	}

}
