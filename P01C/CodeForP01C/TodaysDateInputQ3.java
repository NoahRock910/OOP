// Write a program declaring suitable variables to store today’s date. Read in values to each of the variables and display today’s date on screen in the format dd/mm/yyyy.

import java.util.*;
public class TodaysDateInputQ3
{
  public static void main(String[] args)
  {
     Scanner keyboardIn = new Scanner(System.in);
     
     // variables
     int day;
     int month;
     int year;
     
     // Q&A
     System.out.print("What (numbered) day of month is it?: ");
     day = keyboardIn.nextInt();
     
     System.out.print("What (numbered) month is it?: ");
     month = keyboardIn.nextInt();
     
     System.out.print("What (numbered) year is it?: ");
     year = keyboardIn.nextInt();
     
     //DISPLAY current date on screen
	  	System.out.print("The current date is " + day + "/" + month + "/" + year);

  }//end main
}//end class


     