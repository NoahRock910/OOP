/* 2. Adapt the question above so that your program can determine if the binary number is a
palindrome. (A palindrome is a word, phrase, number, or other sequence of symbols or
elements, whose meaning may be interpreted the same way in either forward or reverse
direction).
For Example :
1100 0011 is a palindrome
1101 0111 is not a palindrome */
import java.util.*;
public class A2
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //create an integer array with 5 integer elements
      int[] myArray = new int[8];
      int[] revArray = new int[8];
      int beValidated, j = 0;
      boolean palindrome = true;
      
      //load the array with values
      for(int i = 0; i<myArray.length; i++)
      {
         System.out.print("Enter the #" +(i+1) +" bit : ");
         beValidated = keyboardIn.nextInt();
         
         if(beValidated > -1 && beValidated < 2)
           myArray[i] = beValidated;
         else
         {
           System.out.println("Invalid number entered");
           System.out.println("");
           i--;
         }
      }
      
      //Palindrome test           
      for(int i = (myArray.length -1); i >= 0; i--)
      {
        revArray[j] = myArray[i];
        j++;
      }
      
      for(int i = 0; i <myArray.length; i++_
      {
        if((int)myArray
      }
      
      if(revArray == myArray)
        System.out.print("The 8 bit binary array is a palindrome");
      else
        System.out.print("The 8 bit binary array is not a palindrome");
   }
}

