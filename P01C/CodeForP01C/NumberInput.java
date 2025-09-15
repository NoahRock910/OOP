/*
	Written By:Maeve Carr
	Desc:  a simple program inputting values
	FileName: NumberInput.java
	Date: 17 Sept 
*/

import java.util.*;
public class NumberInput
{
  public static void main(String[] args)
  {
      //create instance of Scanner class
		Scanner keyboardIn = new Scanner(System.in);
      
      //DECLARE 2 int vars
	  	int no1, no2;
		
	  	//PROMPT user to enter value 
	   System.out.print("Enter first number:  ");
      //READ and store value
      no1 = keyboardIn.nextInt(); 
      //PROMPT user to enter value 
	   System.out.print("Enter second number:  ");
      no2 = keyboardIn.nextInt(); 
		
	  	//DISPLAY current year on screen
	  	System.out.print("the numbers chosen are  " +no1 +" and " +no2);

  }//end main
}//end class
