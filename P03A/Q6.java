/* Write a Java program using the switch statement that will prompt the
user to enter a sport (as a string), and will display the number of people
needed to form a team based on the table below:
Sport No. in Team
Tennis, Badminton 1
basketball 5
Hurling, football 15
Soccer 11
Any other string Unknown sport */
import java.util.*;
public class Q4
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
