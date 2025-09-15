//Importing Scanner
import java.util.Scanner;
public class Q1
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
   
   //Initilising Variable
      double bankBalance = 0;
   
   //Recive variable
      System.out.print("Please enter your bank balance: ");
      bankBalance = keyboardIn.nextDouble();
   
   //If statement
      if(bankBalance > 0)
      {
         System.out.println("You are in credit");
      }
   } //end main method
} //end class
