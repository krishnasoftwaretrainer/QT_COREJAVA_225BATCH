package com.Java.Arrays;

public class DoubleDimensionArray_Static {

	public static void main(String[] args) {

		//int a[][]= {{1,2,3,0},{4,5,6,0},{7,8,9,0}}; // 3 rows and 3 columns
		int a[][]= {{1,2},{4,5},{7,8}};
		/*
		//for(int i=0;i<3;i++) // outer loop for rows
		for(int i=0;i<a.length;i++) // outer loop for rows
		{
			//for(int j=0;j<3;j++) // inner loop for columns
			for(int j=0;j<a.length;j++) // inner loop for columns
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		} */
		
		//for each loop
		for(int row[]:a) // outer loop for rows
		{
			for(int col:row) // inner loop for columns
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

}
