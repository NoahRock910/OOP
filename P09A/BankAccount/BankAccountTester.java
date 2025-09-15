/*
	Written by : Maeve Carr
	Date:
	Desc:
*/

public class BankAccountTester
{
   public static void main(String [] args)
   {  
   
     
	   // create an instance of type BankAccount
	   BankAccount myAccount = new BankAccount();
      BankAccount myAccount2 = new BankAccount(99);
	   	
		System.out.println("ACC1 Initial Balance " +myAccount.getBalance() );
      System.out.println("ACC2 Initial Balance " +myAccount2.getBalance() );
      
      System.out.println("ACC1 Account Number " +myAccount.getAccNum() );
      System.out.println("ACC2 Account Number " +myAccount2.getAccNum() );

		
		myAccount.deposit(100);   
	
		System.out.println("After calling deposit(100) balance is:  " +myAccount.getBalance() );
		
		myAccount.withdraw(15);   
	
		System.out.println("After calling withdraw(15) balance is:  " +myAccount.getBalance() );

   }
}
