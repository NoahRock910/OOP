/*
	Written By: Maeve
	Desc:
	Date: 17 Sept 
*/

//import packages containing predefined classes
import java.util.Scanner;
public class CharInput
{
	/**main method*/
	public static void main(String[] args)
	{
		//create instance of scanner class
		Scanner keyboardIn = new Scanner(System.in);
		
		//declare variables
		char letter;
      
	   System.out.print("Enter any letter : ");
      //READ and STORE a single character
		letter = keyboardIn.next().charAt(0);
			
		//output
		System.out.println("Letter is " +letter );
		
	}//end main method
}//end class
