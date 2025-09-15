/*
	Written by : Maeve Carr
	Date:
	Desc:
*/

/**
	An Oblong has a width and a height
*/
public class BankAccount
{
    // the attributes are declared first
   private double balance;
   private int accNum;

    // then the methods
   public double getBalance()
   {
      return balance;
   }

   public void deposit(double amount)
   {
      balance += amount;
   }
   
   public void withdraw(double amount)
   {
      if(amount < balance)
        balance -= amount;
      else
        System.out.println("You cant take out more then is in the bank");
   }
   
   public void setAccNum(int accNumIn)
   {
     accNum = accNumIn;
   }
   
   public int getAccNum()
   {
     return accNum;
   }

}//end class