//Devise an algorithm that will accept a 4 digit integer as input. 
//The number should then be displayed in reverse order. 
//Write, compile and run the Java program.


/*
Recive 4 int
check to see if 4 digit
reverse the number
*/
import java.util.*;
public class Q5
{
  public static void main(String[] args)
  {
   //create instance of Scanner class
   Scanner keyboardIn = new Scanner(System.in);
      
   //DECLARE vars
   String digit4,rDigit4;
   char c0;
   char c1;
   char c2;
   char c3;
   int length;
		
	//PROMPT user to enter value 
	System.out.print("Enter 4 digits:  ");
   digit4 = keyboardIn.next(); 
   
   length = digit4.length();
   
   if (length ==4)
   { 
     c0 = digit4.charAt(0);
     c1 = digit4.charAt(1);
     c2 = digit4.charAt(2);
     c3 = digit4.charAt(3);
     
     String s0 =String.valueOf(c0);
     String s1 =String.valueOf(c1);
     String s2 =String.valueOf(c2);
     String s3 =String.valueOf(c3);
     rDigit4 = (s3 + s2 + s1 + s0);
	  //DISPLAY
     System.out.print("The reverse of for digits is: " +rDigit4);
   }

  }//end main
}//end class
