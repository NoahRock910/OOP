import java.util.*;
import java.util.ArrayList;

 public class ArrayListTester
 {
 	public static void main(String[] args)
   {
  		//create an ArrayList of BankAccounts called accountList
		ArrayList<Activity> activityList = new ArrayList<Activity>();
      
      //Scanner
      Scanner keyIn = new Scanner(System.in);
      
      //Variables
      int nameChoice;
      int cBPMChoice;
      boolean flag = false;
      
		//add some new account to list
      for(int i = 0; i<10; i++)
      {
        System.out.println("Enter the name of the activity: ");
        nameChoice = keyIn.next();
        
        System.out.println("Enter how many calories it burn per min: ");
        cBPMChoice = keyIn.next();
        
        activityList.add(new Activity(nameChoice, cBPMChoice));
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
      
   }
} 
