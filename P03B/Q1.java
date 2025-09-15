/* Use the conditional operator, ( ternary operator ) to write a program that will evaluate a
grade entered from the user and will display a message indicating pass or fail on screen. */
import java.util.*;
public class Q1
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
   
      //Initilising Variable
      char grade;
   
      //Recive variable
      System.out.println("Input the grade you recived: ");
      grade = keyboardIn.next().charAt(0);  
      //ternary operator
      System.out.print(grade>=40 ? "pass":"fail");
    } //end main method
} //end class
