//Write a piece of code using an appropriate control structure that will
//examine the value of a double variable called temp and print one of the
//following messages, depending on the value assigned to temp.
//ICE, if the value of temp is less than 0.
//WATER, if the value of temp lies between 0 and 100.
//STEAM, if the value of temp exceeds 100.
//Justify why you selected this particular control structure.
import java.util.Scanner;
public class Q1
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
   
      //Initilising Variable
      double temp;
   
      //Recive variable
      System.out.print("Please enter the value of temp: ");
      temp = keyboardIn.nextInt();
   
      //If statement
      if(temp <= 0)
      {
         System.out.println("ICE");
      }
      else if(temp <100)
      {
         System.out.println("WATER");
      }
      else
      {
         System.out.println("STEAM");
      }
      //I choose this control structure because all the ifs are reachable

   } //end main method
} //end class
