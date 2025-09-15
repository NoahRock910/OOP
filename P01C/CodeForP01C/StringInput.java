/*
	Written By: Maeve
	Desc:
	Date: 17 Sept 
*/

//import packages containing predefined classes
import java.util.Scanner;
public class StringInput
{
	/**main method*/
	public static void main(String[] args)
	{
		//create instance of Scanner class
		Scanner keyboardIn = new Scanner(System.in);
		
		//declare variables
		String firstName;
		String surname, text;
      
		//get input
		System.out.print("Enter your first name: ");
		firstName = keyboardIn.nextLine();
		System.out.print("Enter your surname: ");
		surname = keyboardIn.nextLine();
			
		//output
		System.out.println("\nHello " + firstName + " " + surname);
		System.out.println("Welcome to the \"Scanner\" class!");
      
      //get input
		System.out.print("\n\nType in a sentence (more that one word): ");
		text = keyboardIn.nextLine();
				
		//output
		System.out.println("\n***Oops what did you type?  " + text);
      System.out.println("\nLook at the source code - what happened? " );

	}//end main method
}//end class
