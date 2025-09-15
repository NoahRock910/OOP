/*  Written By:  Maeve Carr
	 Date:
	 Desc:
	 File:
*/
 
import java.util.*;
import java.util.ArrayList;
 /**
    This program tests the ArrayList class.
    
    DO YOU UNDERSTAND THIS CODE?
 */
 public class ArrayListTester
 {
 	public static void main(String[] args)
   {
  		//create an ArrayList of BankAccounts called accountList
		ArrayList<BankAccount> accountList = new ArrayList<BankAccount>();
      
      //Scanner
      Scanner keyIn = new Scanner(System.in);
      
      //Variables
      int choice;
      boolean flag = false;
      
		//add some new account to list
      for(int i = 0; i<10; i++)
      {
        accountList.add(new BankAccount());
      }
      
      for(int i = 0; i<accountList.size(); i++)
      {
        System.out.println(accountList.get(i));
      }
      
      //System.out.println("size=" + accountList.size());
		//remove account at index position 0
		//accountList.remove(0); 
		
		//display on screen
      //System.out.println("after removing an account size=" + accountList.size());
  		
		//create new BankAccount object anAccount to store first object in list
		//BankAccount anAccount = accountList.get(0);	
		
      //System.out.println("first account number="  + anAccount.getAccountNumber());
		//System.out.println("balance="  + anAccount.getBalance());
		
		//gets last object in list - list indexed from 0 to size() - 1
      //BankAccount last = accountList.get(accountList.size() - 1);
      
      //anAccount =  accountList.get(accountList.size() - 1);
      //System.out.println("last account number=" + anAccount.getAccountNumber());
      
      //System.out.println("Or do it this way - last account number=" + accountList.get(accountList.size() - 1).getAccountNumber()); 
      
      /////write code here to remove an account based on account number
      System.out.print("Enter the account number you would like to remove: ");
      choice = keyIn.nextInt();
      
      for(int i = 0; i<accountList.size(); i++)
      {
        if(accountList.get(i).getAccountNumber() == choice)
        {
          System.out.println(accountList.get(i).getAccountNumber());
          flag = true;
          System.out.println(i);
        }
      }
      
      if(flag)
        System.out.println("Account removed");
      else
        System.out.println("Could not find an account linked with the account number given");
        
      System.out.println("size = " + accountList.size());
      
      
      
      
      /////write code here to deposit 100 to account number 1002 
      
   }
} 
