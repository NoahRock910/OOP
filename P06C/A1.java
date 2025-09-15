/*Write a program that will create an array and load it with an 8 bit binary number (eg.
0011 0111). Validate the input i.e. the array can only hold 1’s or 0’s. Display the binary
number. */
import java.util.*;
public class A1
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //create an integer array with 5 integer elements
      int[] myArray = new int[8];
      int beValidated;
      
      //load the array with values
      for(int i = 0; i<myArray.length; i++)
      {
         System.out.print("Enter the #" +(i+1) +" bit : ");
         beValidated = keyboardIn.nextInt();
         
         if(beValidated > -1 && beValidated < 2)
         {
           myArray[i] = beValidated;
         }
         else
         {
           System.out.println("Invalid number entered");
           System.out.println("");
           i--;
         }
      }           
   }
}
