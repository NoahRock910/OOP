//Write a program that will read two numbers from the user and that will
//determine whether or not the first number is a multiple of the second. (i.e.
//the second is a factor of the first) .
//Write a program that will read two numbers from the user and that will
//determine whether or not the first number is a multiple of the second. (i.e.
//the second is a factor of the first).
import java.util.Scanner;
public class Q4
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
   
      //Initilising Variable
      int number1, number2;
   
      //Recive variable  
      System.out.print("Enter number1: ");
      number1 = keyboardIn.nextInt();
      
      System.out.print("Enter number2: ");
      number2 = keyboardIn.nextInt();
   
      //If statemenet
      if(number1 % number2 == 0)
      {          
         System.out.println(number1 +" is a multiple of " +number2);
      }
      else
      {
         System.out.println(number1 +" is not a multiple of " +number2);
      }
   } //end main method
} //end class
