package com.Java.ConditionalStatements;

public class SwagLogin {

	public static void main(String[] args) {

		String username="standard_user";
		String password="secretsauce";
		//validating username and password
		
		if(username.equals("standard_user") || password.equals("secret_sauce"))
		{
			System.out.println("Login Successful");
			//TBS
		}
		else
		{
			System.out.println("Login Failed");
			//FBS
		}

	}

}
