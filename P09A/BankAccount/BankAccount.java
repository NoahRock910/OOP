/*
	Written by : Maeve Carr
	Date:
	Desc:
*/

import java.util.Random;
public class BankAccount
{
	//instance variables
	//accessSpec type varname;
	private double balance;
   private int accNum;
   
   Random rand = new Random();
   //Constructors
   public BankAccount()
   {
     balance = 0.0;
     accNum = rand.nextInt(100000);
   }

   public BankAccount(double opBalance)
   {
     balance = opBalance;
     accNum = rand.nextInt(100000);
   }
   
	//methods
	//accessSpec returntype varname(argList){}
	//return the balance
	public double getBalance()
	{
		return balance;
	}
   
   public double getAccNum()
	{
		return accNum;
	}

	//reduce the balance by amount
	public void withdraw(double amount)
	{
		if(amount <= balance) //if enought money
			balance = balance - amount; //balance -=amount
	}
	//increase the balance by amount
	public void deposit(double amount)
	{
		balance = balance + amount;	
	}
	
	

}//end class