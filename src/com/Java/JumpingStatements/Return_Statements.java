package com.Java.JumpingStatements;

public class Return_Statements {

	public static void main(String[] args)
	{
for(int i=1;i<=10;i++) //6<=10T
			
		{
			if(i==5) //5==5T 6==5F
			{
				return;
			}
		System.out.println(i); //1 2 3 4 6
		}
		
		System.out.println("End of the Program");
		System.out.println("Thankyou");
	}
	}


