package com.Java.basicPrograms;

import com.Java.Methods.Calculator1;

public class Calculator3 
{
	
	//Different Package and Different Class
	public static void main(String[] args)
	{
			Calculator1 cal3=new Calculator1();
			cal3.Addition();  //public 
			Calculator1.Subtraction();  //private
			cal3.Multiplication(); //protected
			Calculator1.Division(); //default
			
			
			
	}
}
