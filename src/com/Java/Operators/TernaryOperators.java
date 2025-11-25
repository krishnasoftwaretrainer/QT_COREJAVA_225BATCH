package com.Java.Operators;

import java.util.Scanner;

public class TernaryOperators {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//int Obtainedmarks = 75;
		System.out.println("Enter the obtained marks: ");
		int Obtainedmarks = scanner.nextInt();
		//boolean result=Obtainedmarks>=35?true:false;
		
		String result=Obtainedmarks>=35?"Pass":"Fail";
		
		System.out.println("Result is: "+result);
	}

}
