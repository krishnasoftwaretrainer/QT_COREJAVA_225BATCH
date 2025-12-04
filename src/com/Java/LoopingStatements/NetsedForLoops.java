package com.Java.LoopingStatements;

public class NetsedForLoops {

	public static void main(String[] args) {
	/*	1  2  3  4  5
		1  2  3  4  5
		1  2  3  4  5
		1  2  3  4  5
		1  2  3  4  5 	*/  
		
	/*	1  1  1  1  1
		2  2  2  2  2
		3  3  3  3  3
		4  4  4  4  4
		5  5  5  5  5 	*/  
		/*
		for(int i=1;i<=5;i++) // Rows 1<=5 T 2<=5 T
		{
			for(int j=1;j<=5;j++) // Columns Cells  
			{		//1<=5 T 2<=5 T 3<=5 T 4<=5 T 5<=5 T 6<=5 F
				System.out.print(j+"  ");
			} //Exit 
			System.out.println();
		} */ //Exit of Outer Loop
/*	Outer Loop:
 * i=1;i<=5;i++  
 * 		1<=5 T
 * 		Inner Loop:
 * 		j=1;j<=5;j++
 * 			1<=5 T  print 1
 * 			2<=5 T  print 2
 * 			3<=5 T  print 3
 * 			4<=5 T  print 4
 * 			5<=5 T  print 5
 * 			6<=5 F Exit Inner Loop
 * 		Print New Line
 * Outer Loop:
 * i=1;i<=5;i++ 2<=5 T
 * 	-----------
 * 	Outer Loop:
 * i=1;i<=5;i++ 6<=5 F Exit Outer Loop
 * 
 * 	1   2   3   4   5  
 * 	1   2   3   4   5
 * 	1   2   3   4   5
 * 	1   2   3   4   5
 * 	1   2   3   4   5  
 *  
 */
		/*
		for(int i=1;i<=5;i++) // Rows 1<=5 T 2<=5 T
		{
			for(int j=1;j<=5;j++) // Columns Cells  
			{		//1<=5 T 2<=5 T 3<=5 T 4<=5 T 5<=5 T 6<=5 F
				System.out.print(i+"  ");
			} //Exit 
			System.out.println();
		}
		*/
		/*
		for(int i=1;i<=5;i++) // Rows 1<=5 T 2<=5 T
		{
			for(int j=1;j<=10;j++) // Columns Cells  
			{		//1<=5 T 2<=5 T 3<=5 T 4<=5 T 5<=5 T 6<=5 F
				System.out.print(" * ");
			} //Exit 
			System.out.println();
		}
		*/
		/*	1
		 * 	1 2
		 * 	1 2 3
		 * 	1 2 3 4
		 * 	1 2 3 4 5
		 */
		/*
		for(int i=1;i<=5;i++) // Rows 1<=5 T 2<=5 T
		{
			for(int j=1;j<=i;j++) // Columns Cells  
			{		
				System.out.print(j+"  ");
				//System.sout.print(" ## ");
			} 
			System.out.println();
		}
		*/

	
	/* A 
	 * A	B
	 * A	B	C
	 * A	B	C	D
	 * A	B	C	D	E
	 */
		/*
		for(int i=65;i<=90;i++) // Rows 1<=5 T 2<=5 T
		{
			for(int j=65;j<=i;j++) // Columns Cells  
			{		
				System.out.print((char)j+"  ");
				
			} 
			System.out.println();
		}
		*/
		int num=5;
		for(int i=1;i<=5;i++) // Rows 1<=5 T 2<=5 T
		{
			for(int j=1;j<=i;j++) // Columns Cells  
			{		
				System.out.print(num++ +"  ");
				
			} 
			System.out.println();
		}
	}

	/*	1
	 * 	2 3
	 * 	4 5 6
	 * 	7 8 9 10
	 * 	11 12 13 14 15
	 */
}