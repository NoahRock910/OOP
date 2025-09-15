/*Adapt the previous program so that it will display a message indicating if the number is
positive, negative or zero. (Nest the conditional operator) */
import java.util.*;
public class Q3
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
     System.out.print(number== 0 ? "Number is neutral" :number<0 ? "Number is negative":"Number is postive");
    } //end main method
} //end class
