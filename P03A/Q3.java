/*The following piece of Java code will read and store a single character
from the keyboard :
char letter;

 System.out.println("Input a character: ");
 letter = keyboardIn.next().charAt(0);

Write a program using a switch control structure that will prompt the
user to enter a character and will determine if the character is a vowel
or not.*/
import java.util.*;
public class Q3
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
   
      //Initilising Variable
      char letter;
   
      //Recive variable
      System.out.println("Input a word: ");
      letter = keyboardIn.next().charAt(0);  
      //switch
      switch (Character.toLowerCase(letter))
      {
        case 'a': 
        case 'e': 
        case 'i': 
        case 'o':
        case 'u': 
             System.out.print("The first charcter is a vowel");;
             break;
        default:
             System.out.print("The first charcter is not a vowel");;
             break;
      } //end switch
      
    } //end main method
} //end class
