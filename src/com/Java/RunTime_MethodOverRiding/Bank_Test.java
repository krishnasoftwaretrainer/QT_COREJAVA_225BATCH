package com.Java.RunTime_MethodOverRiding;

public class Bank_Test {

	public static void main(String[] args) 
	{
		/*
		RBI_Parent sbi = new SBI_Child1();
		sbi.rateOfInterest();
		
		RBI_Parent hdfc = new HDFC_Child2();
		hdfc.rateOfInterest();
		
		RBI_Parent icici = new ICICI_Child3();
		icici .rateOfInterest();
		*/
		
		RBI_Parent roi;
		roi = new SBI_Child1();
		roi.rateOfInterest();
		roi.Timings();
		
		roi = new HDFC_Child2();
		roi.rateOfInterest();
		
		roi = new ICICI_Child3();
		roi.rateOfInterest();
	}

}
