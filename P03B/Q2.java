/* Using the conditional operator, ( ternary operator )write a program that will evaluate a
number entered from the keyboard and will display an appropriate message on screen
depending on whether the number is positive or negative. */
import java.util.*;
public class Q2
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
   
      //Initilising Variable
      int number;
   
      //Recive variable
      System.out.println("Input a number: ");
      number = keyboardIn.nextInt();  
      //ternary operator
      System.out.print(number<0 ? "Number is negative":"Number is postive");
    } //end main method
} //end class
