/* Write a method named printNewline() that takes no arguments and
simply prints a blank line (moves the cursor to a new line). Call your
method.
Write another method, named printThreeLines(), that prints three new
lines. Use the method printNewline(). Test your code.
Write another method, named printNlines(int n), that prints n new lines.
Use the method printNewline (). Test your code. */

/* Written By Noah 
   October 18     */
import java.util.*;
public class Q1
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int amtOLines;
      
      System.out.println("How many lines do you want to print? ");
      amtOLines = keyboardIn.nextInt();
      
      //if (amtOLines == 1)
      //  printNewLine();
     // else if (amtOLines == 3)
      //  printThreeLines();
     // else
      //  printNlines(amtOLines);
   
      printNlines(amtOLines);
      System.out.println("The end.");
   }
   
   //Prints a clear line
   public static void printNewLine()
   {
     System.out.println(); //Prints a clear line
   }
   
   //Prints three lines
   public static void printThreeLines()
   {
     System.out.println();
     System.out.println();
     System.out.println();
   }
   
   public static void printNlines(int n)
   {
     for(int i = 0; i < n; i++)
     {
       printNewLine();
     }
   }
}