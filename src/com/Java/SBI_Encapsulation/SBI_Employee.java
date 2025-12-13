package SBI_Encapsulation;

public class SBI_Employee 
{

	public static void main(String[] args) 
	{
		SBI_Customer cust=new SBI_Customer();
		System.out.println("Customer Balance: "+cust.getBalance()); //CTE: balance has private access in SBI_Customer
	
		cust.setBalance(10000);
		System.out.println("Customer Balance: "+cust.getBalance());
	
	}
}
