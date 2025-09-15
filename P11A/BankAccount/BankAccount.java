/*  Written By:  Maeve Carr
	 Date:
	 Desc:
	 File:
*/



/**
    A bank account has a balance that can be changed by 
    deposits and withdrawals.*/
public class BankAccount
{  
	//instance fields
	private double balance;
	
	public BankAccount()
	{
	
	}
	public BankAccount(double balanceIn)
	{
		balance = balanceIn;
	}
   
   /**
       Deposits money into the bank account.
       @param amount the amount to deposit
    */
    public void deposit(double amount)
    {  
        balance = balance + amount;
    }
 
    /**
       Withdraws money from the bank account.
       @param amount the amount to withdraw
    */
    public void withdraw(double amount)
    {   
       balance = balance - amount;
       
	 }
 
   /**
       Gets the current balance of the bank account.
       @return the current balance.
    */ 
    public double getBalance()
    {   
       return balance;
    }
    
    public void transfer(double amount, BankAccount other)
    {
      withdraw(amount);
      other.deposit(amount);
    }
} 
