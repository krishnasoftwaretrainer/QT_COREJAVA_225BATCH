package com.Java.DataTypes_Variables;

public class Variable_Types {
	// Inside Class and OutSide Method/MainMethod
	// Global
	int htno; // Instance
	String name;
	static String cname = "QT";

	public static void main(String[] args) 
	{
		//Inside Class and Inside Method/MainMethod
		/*
		int htno1;
		int  htno2=102;
		int htno3=103;
		
		//System.out.println("HTNO: "+htno1);
		System.out.println("HTNO: "+htno2);
		System.out.println("HTNO: "+htno3);
		
		System.out.println(obj.a);
*/
		Variable_Types obj1=new Variable_Types();
		
		obj1.htno=101;
		obj1.name="Krishna";
		//obj1.cname="QT";
		Variable_Types obj2=new Variable_Types();
		obj2.htno=102;
		obj2.name="Ramesh";
		//obj2.cname="QT";
		Variable_Types obj3=new Variable_Types();
		obj3.htno=103;
		obj3.name="Suresh";
		//obj3.cname="QT";
		System.out.println("HTNO: "+obj1.htno); //101
		System.out.println("Name: "+obj1.name); //101
		//System.out.println("CName: "+obj1.cname); //101
		System.out.println("CName: "+Variable_Types.cname);
		
		System.out.println("HTNO: "+obj2.htno); //102
		System.out.println("Name: "+obj2.name); //101
		System.out.println("CName: "+obj2.cname); //101
		
		System.out.println("HTNO: "+obj3.htno); //102
		System.out.println("Name: "+obj3.name); //101
		System.out.println("CName: "+obj3.cname); //101
	
		//Final Variable
		final float pi=3.14f;
		pi=3.15f;
		System.out.println("Final: "+pi); //101
		
		
	}

}
