/*******************************
	Written by: Maeve Carr
	Date : 		25 Sept 12
	Desc :		
	Filename:	Q2Days
*****************************/
import java.util.*;

public class BankAccTester 
{	
	public static void main(String[] args) 
	{
	  BankAccount b = new BankAccount(10);
	  SavingsAccount s = new SavingsAccount(5); 
     SavingsAccount collegeFund = new SavingsAccount(5, 100); 
	  CurrentAccount c = new CurrentAccount();
	  
	  s.setInterestRate(10);
	  
	  b.deposit(100);
	  s.deposit(200);
     c.deposit(200);
	  
	  //add interest
	  s.addInterest();
     s.withdraw(30);
	  
	  System.out.println("bank account balance is: " +b.getBalance());	
	  System.out.println("Savings account balance is: " +s.getBalance());	
	
		for(int i = 0; i < 10; i++)
		{
			c.deposit(100);
		}
		
		System.out.println("current account balance is: " +c.getBalance());		
		c.deductFees();
		System.out.println("after deducting fees balance is: " +c.getBalance());
	}

}