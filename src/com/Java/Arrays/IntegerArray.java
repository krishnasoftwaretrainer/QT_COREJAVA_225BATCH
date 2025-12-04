package com.Java.Arrays;

public class IntegerArray {

	public static void main(String[] args) {
		/*
		int htno[]={101,102,103,104}; //
		
		for( int i=0;i<4;i++)
		{
			System.out.println(htno[i]);
		}
		*/
		
		/*
		float percentage[]={78.5f,88.5f};
		
		for(int i=0;i<percentage.length;i++)
		
		{
			System.out.println(percentage[i]);
			//System.out.print(percentage[i]+" ");
		}
		*/
		
		char gender[]={'M','F','M','F'};

		//for(int i=0;i<gender.length;i++)
		for(char newgender: gender)
		
		{
			System.out.println(newgender);
			//System.out.print(percentage[i]+" ");
		}
	}

}
