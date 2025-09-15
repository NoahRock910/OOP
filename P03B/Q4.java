/*Write a program that will prompt the user to enter the time of day in Ireland and will
display the equivalent time in New York (-5 hours), San Francisco (- 8 hours), Sydney
(+10 hours). Input the time in 24 hour format. Your program should deal with invalid
times.
Use the conditional operator to ensure that all times are correctly formatted with leading
zeros where necessary. (E.g. 01:05 not 1:5) */
import java.util.*;
public class Q4
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
   
      //Initilising Variable
      int hours, mins, counter, temp;
      counter = 0;
      hours = 0;
      mins = 0;
   
      //Recive variable
      System.out.print("Input the time of day in ireland (24hr format, input :): ");
      String timeODay = keyboardIn.next();  
      String[] arrOfStr = timeODay.split(":", 2);
      
      for (String a : arrOfStr)
      { 
         temp = Integer.parseInt(a); 
         if (counter == 0)
         {
           hours = temp;
           counter +=1;
         }
         else
           mins = temp;
      }     
      //ternary operator
      System.out.println((hours<5 ? "New york time is " + (hours-5+24) : "New york time is " + (hours-5) ) + ":" +mins);
      System.out.println((hours<8 ? "New york time is " + (hours-8+24) : "New york time is " + (hours-8) ) + ":" +mins);
      System.out.print((hours>10 ? "New york time is " + (hours+10-24) : "New york time is " + (hours+10) ) + ":" +mins);
      } //end main method
} //end class
