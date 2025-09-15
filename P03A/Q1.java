/*Write a program using the switch statement that will prompt the user to
enter a grade and will display the appropriate message depending on the
grade entered.
Grade Message
A or a Excellent student
B or b Good student
C or c, D or d Fair student
E or e, F or f Poor Student
Any other value Invalid grade*/
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
      //switch
      switch (Character.toLowerCase(grade))
      {
        case 'a': System.out.print("Excellent student");;
             break;
        case 'b': System.out.print("Good student");;
             break;
        case 'c': 
        case 'd': 
             System.out.print("Fair student");;
             break;
        case 'e':
        case 'f':
             System.out.print("Poor student");;
             break;
        default:
             System.out.print("Invalid grade");;
             break;
      } //end switch
    } //end main method
} //end class
