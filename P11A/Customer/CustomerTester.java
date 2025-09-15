/**
This program tests the Customer class and
its subclasses. 
*/
public class CustomerTester
{  
	public static void main(String[] args)
	{  
		Customer c1 = new Customer("Joe Bloggs", 111);

		Customer c2 = new Customer("Mary Bloggs", 222);

		c1.makePurchase(100);
		c2.makePurchase(200);
		c1.makePayment(50);
		
		System.out.println("cust 1: " +c1.getName() +" " +c1.getBalance());
		System.out.println("cust 2: " +c2.getName() +" " +c2.getBalance());

	}
	
} 

