package com.Java.basicPrograms;

public class WOR_WP {
	// WithOut Returntype and With Parameters

	public void Addition(int a, int b) {

		int c = a + b;
		System.out.println("Addition is: " + c);
	}

	public static void main(String args[]) {
		WOR_WP worwp = new WOR_WP();
		worwp.Addition(10, 20);
		worwp.Addition(100, 200);
		worwp.Addition(1000, 2000);
	}
}
