//Write a program that will display one of the following messages depending
//on the value of grade entered.
//Congratulations!
//You have passed
//OR
//You have failed
//You must take this course again
import java.util.Scanner;
public class Q3
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
   
      //Initilising Variable
      int grade;
   
      //Recive variable  
      System.out.print("What grade did you get: ");
      grade = keyboardIn.nextInt();
   
      //If statemenet
      if(grade >= 40)
      {          
         System.out.println("Congratulations!\nYou have passed");
      }
      else
      {
         System.out.println("You have failed\nYou must take the course again");
      }
   } //end main method
} //end class
