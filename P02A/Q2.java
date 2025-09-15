//Write a Java program that will convert a temperature in Fahrenheit to Celsius using the formula
//C = 5(F -32)/9
import java.util.*;
public class Q2
{
  public static void main(String[] args)
  {
   //create instance of Scanner class
   Scanner keyboardIn = new Scanner(System.in);
      
   //DECLARE vars
   double farhen, cel;
		
	//PROMPT user to enter value 
	System.out.print("Enter temp in farhenheight:  ");
   farhen = keyboardIn.nextInt(); 
      
   cel = (5*(farhen -32)) /9;
		
	//DISPLAY
   System.out.print("The tempeture in Celsius is: " +cel);

  }//end main
}//end class
