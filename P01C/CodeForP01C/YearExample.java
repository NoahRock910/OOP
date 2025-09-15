/*
	Written By:Maeve Carr
	Desc:  a simple program using variables
	FileName: YearExample.java
	Date: 17 Sept 
*/


import java.util.Scanner;
public class YearExample
{
  public static void main(String[] args)
  {
      Scanner keyboardIn = new Scanner(System.in);

      //DECLARE variable to hold year
	  	int year;
		
      //Asking the question
      System.out.print("What year is it?: ");

	  	//ASSIGN a value to variable year 
		year = keyboardIn.nextInt(); 
		
	  	//DISPLAY current year on screen
	  	System.out.print("The current year is ");
	  	System.out.println(year);

  }//end main
}//end class
