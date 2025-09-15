//Write a program that will read in the balance of an account and will display
//one of two possible messages, depending on the value of accountBalance.
//Your account is overdrawn by ? euro if the balance is less than 0 or Your
//account is in credit by ? euro if not.
import java.util.Scanner;
public class Q2
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
   
      //Initilising Variable
      double accBalance;
   
      //Recive variable  
      System.out.print("Please enter your bank balance: ");
      accBalance = keyboardIn.nextDouble();
   
      //If statemenet
      if(accBalance >= 0)
      {          
         System.out.println("Your account is in credit by " +accBalance +" euro");
      }
      else
      {
         System.out.println("Your account is overdrawn by " +(accBalance * -1) +" euro");
      }
   } //end main method
} //end class
