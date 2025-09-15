//Write a program that will ask the user to enter a number and will display a message to say whether it is an even number or an odd number.
import java.util.Scanner;
public class Q1
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
   
      //Initilising Variable
      int number;
      double checker;
   
      //Recive variable  
      System.out.print("Please enter your number: ");
      number = keyboardIn.nextInt();
   
      //If statemenet
      checker = number % 2;
      if(checker == 0)
      {          
         System.out.println("Your number is even");
      }
      else
      {
         System.out.println("Your number is odd");
      }
   } //end main method
} //end class
