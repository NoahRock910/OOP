/*Write a program, using the switch structure, to input a number 1 to 7
from the keyboard, where 1 represents Sunday, 2 Monday ….etc. Display
the day of the week corresponding to the number typed by the user. If
the user types a number outside the range 1 to 7, display and error
message.*/
import java.util.*;
public class Q2
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
   
      //Initilising Variable
      int day;
   
      //Recive variable
      System.out.print("Please enter a day of the week defined by the number of day in the week its is (Sunday = 1): ");
      day = keyboardIn.nextInt();
      
      if (day >=0 && day <=7)
      {
        //switch
        switch(day)
        {
          case 1: System.out.print("Sunday");
               break;
          case 2: System.out.print("Monday");
               break;
          case 3: System.out.print("Tuesday");
               break; 
          case 4: System.out.print("Wednsday");;
               break;
          case 5: System.out.print("Thursday");;
               break;
          case 6: System.out.print("Friday");;
               break;
          case 7: System.out.print("Saturday");;
               break;
        } //end switch
      }
      else
      {
        System.out.print("You entered in a value that was negative or over 7, please try again.");
      }
    } //end main method
} //end class
