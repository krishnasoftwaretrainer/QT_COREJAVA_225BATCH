package com.Java.JumpingStatements;

public class Break_Statements {

	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)  //1<=10T 2<=10T 3<=10T 4<=10T 5<=10T 6<=10T
			
		{
			if(i==5) //1==5F 2==5F 3==5F 4==5F 5==5T
			{
				break;
			}
		System.out.println(i);  //1 2 3 4
		}
		System.out.println("End of the Program");
		System.out.println("Thankyou");
	}

}
