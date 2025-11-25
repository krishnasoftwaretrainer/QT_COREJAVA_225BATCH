package com.Java.Operators;

public class Relational_Logical_Operators {

	public static void main(String[] args) {
			
		int a = 10, b = 20, c = 10, d = 5;
		
		System.out.println(a>b); // false 10>20
		System.out.println(c<d); // false	 10<5
		
		System.out.println(a>=c && b>d); //true 
		System.out.println(a<=b || c<d); //true
		
		/*10>=10 && 20>5 
		 * 10>10 or 10=10   && 20>5
		 * false or true    && true
		 * true && true = true
		 */

	}

}
