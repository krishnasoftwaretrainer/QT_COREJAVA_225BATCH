package com.Java.Inheritance;

public class ML_Test {

	public static void main(String[] args) {
		ML_Child c = new ML_Child();
		c.grandParentMethod();
		c.parentMethod();
		c.childMethod();
		System.out.println("............................");
		
		ML_Parent p = new ML_Parent();
		p.grandParentMethod();
		p.parentMethod();
		System.out.println("............................");
		
		ML_GrandParent g = new ML_GrandParent();
		g.grandParentMethod();
		
		

	}

}
