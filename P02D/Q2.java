//Write a program which will prompt the user to enter an age and will
//determine the price of a cinema ticket based on the following table:
//Under 12 Free
//Under 18 5.00
//Over 65 4.50
//All others 6.00
import java.util.Scanner;
public class Q2
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
   
      //Initilising Variable
      int age;
   
      //Recive variable
      System.out.print("Please enter your age: ");
      age = keyboardIn.nextInt();
   
      //If statement
      if(age <=0 || age >111)
      {
         System.out.println("Invalid age");
      }
      else if(age < 12)
      {
         System.out.println("Your ticket is free!");
      }
      else if(age >=12 && age <18)
      {
         System.out.println("Your ticket is 5.00");
      }
      else if(age >65)
      {
         System.out.println("Your ticktet is 4.50");
      }
      else
      { 
         System.out.println("Yor ticket is 6.00");
      }

 } //end main method
} //end class
