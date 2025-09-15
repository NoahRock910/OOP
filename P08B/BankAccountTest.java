import java.util.*;
public class BankAccountTest
{
  public static void main(String [] args)
  {
    double amount;
    int choice, accNumIn;
    
    BankAccount bank1 = new BankAccount();
    Scanner keyIn = new Scanner(System.in);
    
    do
    {
      System.out.print("ATU BANK\n\n1. Deposit\n2. Withdraw\n3. Get balance\n4. Set Account Number\n5. Get Account Display\n6. Quit\n\nPlease an select option: ");
   
      choice = keyIn.nextInt();
    
      if(choice == 1)
      {
        System.out.println("Enter the amount you would like to deposit: ");
        amount = keyIn.nextInt();
        bank1.deposit(amount);
      }
      else if(choice == 2)
      {
        System.out.println("Enter the amount you would like to withdraw: ");
        amount = keyIn.nextInt();
        bank1.withdraw(amount);
      }
      else if(choice == 3)
        System.out.println("The balance is: "+ bank1.getBalance());
      else if(choice == 4)
      {
        System.out.println("Input your new account number: ");
        accNumIn = keyIn.nextInt();
        bank1.setAccNum(accNumIn);
      }
      else if(choice == 5)
        System.out.println("Your account number is: "+bank1.getAccNum());
      else if(choice == 6)
      {
        System.out.println("Exting bank.\nThank you for using ATU bank.");
      }
      else
      {
        System.out.println("Error, the number you inputed didnt coincide with a option. \nPlease try again");  
      }
      
    } while(choice <= 5 && choice >= 1);
  }
}