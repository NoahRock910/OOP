//Write a program that will read a number from the user and will determine if the number is negative. 
//If the number is negative the program should display an appropriate message on screen
import java.util.Scanner;
public class Q3
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
   
   //Initilising Variable
      int number;
   
   //Recive variable
      System.out.print("Please enter a number: ");
      number = keyboardIn.nextInt();
   
   //If statement
      if(number < 0)
      {
         System.out.println("Your number is negative!");
      }
   } //end main method
} //end class
