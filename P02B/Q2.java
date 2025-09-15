//Write a program that prompts the user to enter an exam mark and then determines whether the student has passed the exam.
//To pass the exam the student must have gained a mark of 40 or greater.
//Importing Scanner
import java.util.Scanner;
public class Q2
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
   
   //Initilising Variable
      int exMark;
   
   //Recive variable
      System.out.print("Please enter your exam mark: ");
      exMark = keyboardIn.nextInt();
   
   //If statement
      if(exMark >= 40)
      {
         System.out.println("You passed!");
      }
   } //end main method
} //end class
