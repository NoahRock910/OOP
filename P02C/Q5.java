//Write a program that will prompt the user to enter two integer values. The
//user will then be prompted to guess the sum of the numbers. Display one of
//the following messages depending on the guess entered:-
//Well done!! 25 is the correct answer
//Or
//Sorry, you are wrong
//The correct answer is 25

import java.util.Scanner;
public class Q5
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
   
      //Initilising Variable
      int number1, number2, choice, answer;
   
      //Recive variable  
      System.out.print("Enter number1: ");
      number1 = keyboardIn.nextInt();
      
      System.out.print("Enter number2: ");
      number2 = keyboardIn.nextInt();
       
      System.out.print("Guess the sum of  " +number1 + " + " + number2 + "? ");
      choice = keyboardIn.nextInt();
      
      answer = number1 + number2;
   
      //If statemenet
      if(choice == answer)
      {          
         System.out.println("Well done!!" +answer +"is the correct answer");
      }
      else
      {
         System.out.println("Sorry, you are wrong. The correct answer is" +answer);
      }
   } //end main method
} //end class
