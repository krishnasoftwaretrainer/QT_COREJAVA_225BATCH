package com.Java.basicPrograms;

public class WR_WOP
{
	public int Addition()
	{
		int a=10,b=20;
		
		int c = a + b;
		return c;
			
	}
	
	public static void main(String args[])
	{
		WR_WOP wrwop=new WR_WOP();
		//int res=wrwop.Addition();
		//System.out.println("Addition is: " + res);
		System.out.println("Addition is: " +wrwop.Addition());
		
	}
}
