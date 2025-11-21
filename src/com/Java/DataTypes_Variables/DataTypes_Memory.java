package com.Java.DataTypes_Variables;

import java.util.Scanner;

public class DataTypes_Memory {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		//byte a=127; //1byte
		//byte a=129;
		//Type mismatch: cannot convert from int to byte
		//short a=128;
		//short a=32767;  //2bytes
		//short a=32768;
		//Type mismatch: cannot convert from int to short
		//int a=32768;
		//int a=2147483647;
		//int a=2147483648;
		//The literal 2147483648 of type int is out of range 
		//long a=2147483648L;
		//long a=2147483648L;
		
		//float a=11.1234567890123456789f;
		//double a=11.1234567890123456789;
		
		System.out.println("Enter Value: ");
		//byte a=scan.nextByte();
		//InputMismatchException:
		//short a=scan.nextShort();
		//int a=scan.nextInt();
		//long a=scan.nextLong();
		
		//float a=scan.nextFloat();
		//double a=scan.nextDouble();
		
		//Char:'A' 'a' '6' '#'
		//char a='A';
		//char a='ABCD';
		//char a=scan.next().charAt(0);
		//char a=scan.next().charAt(2);
		//boolean a=true;
		 //a=false;
		//boolean a=scan.nextBoolean();
		//String a="Krashna Rao";
		//String a=scan.next();
		String a=scan.nextLine();
		System.out.println(a);
		
		
		
		
		
		
	}

}
