//It has been observed that crickets tend to chirp in the summer at a rate that is related to the temperature by the formula
//T = (c + 40)/10
//where c is the number of chirps per minute and T is the temperature in Fahrenheit degrees. 
//Devise an algorithm that inputs the number of chirps per minute and outputs the temperature in decimal form. 
//Write, compile and run the Java program.

/*
Get chirps
Calculate using formula
Display output
*/

import java.util.*;
public class Q4
{
  public static void main(String[] args)
  {
   //create instance of Scanner class
   Scanner keyboardIn = new Scanner(System.in);
      
   //DECLARE vars
   double t, c;
		
	//PROMPT user to enter value 
	System.out.print("Enter the number of chirps per minute:  ");
   c = keyboardIn.nextInt(); 
      
   t = (c + 40)/10;		
	//DISPLAY
   System.out.print("The tempeture in farhenheight is: " +t);

  }//end main
}//end class
