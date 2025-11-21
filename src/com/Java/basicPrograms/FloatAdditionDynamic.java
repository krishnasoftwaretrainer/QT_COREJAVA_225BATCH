

import java.util.Scanner;

public class FloatAdditionDynamic 
{

	public static void main(String[] args) 
	{
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter any First Float Value: ");
		float v1=scan.nextFloat();
		
		System.out.println("Enter any Second Float Value: ");
		float v2=scan.nextFloat();
		
		float sum=v1+v2;
		
		System.out.println("Addition: "+sum);
		
	}

}
