/*  Written By:  Maeve Carr
	 Date:
	 Desc:
	 File:
*/


public class BankAccount
{

	//instance fields
	private double balance;
	private int accountNumber;
   private static int nextAccNo = 1000; //ensure you understand static variable

	//constructors- 
	public BankAccount()
	{
		balance = 0;
		accountNumber = nextAccNo++;
	}
	
	public BankAccount(double initialBalance)
	{
		balance = initialBalance;
		accountNumber = nextAccNo++;
	}
	
	//methods
	public void deposit(double amount) 
	{ 
   	balance =  balance + amount;			 //add amount to balance
	} 

	public void withdraw(double amount) 
	{ 
   	if(balance >= amount)
			balance = balance - amount; //subtract amount from balance
	} 

	public double getBalance() 
	{ 
  		return balance;
	} 
	
	public int getAccountNumber() 
	{ 
  		return accountNumber;
	} 
   
   public String toString()
   {
     return "Bank Account number: " + accountNumber + "\t" + "Balance: " + balance;
   }


}//end main