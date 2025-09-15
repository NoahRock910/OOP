//Devise an algorithm that will accept a monetary amount in cent as input
//and will compute and display the number of each coin needed to make
//up this amount using the least number of coins possible. Only the
//following coins can be used 2 euro, 1 euro, 50 cent, 20 cent, 10 cent, 5
//cent, 2 cent and 1 cent.
//Sample output
//Enter an amount in cent: 399
//399 is made up of
//1 x €2 + 1 x €1 + 1 x 50 cent + 2 x 20 cent + 0 x 10 cent + 1 x 5 cent +
//2 x 2 cent + 0 x 1 cent

/*
Recive input
divide using coins
2= 200
.50 = 50
.10 = 10
.01 = 1
*/
import java.util.*;
public class Q6
{
  public static void main(String[] args)
  {
   //create instance of Scanner class
   Scanner keyboardIn = new Scanner(System.in);
      
   //DECLARE vars
   int E2;
   int E1; 
   int C50; 
   int C20; 
   int C10;
   int C5; 
   int C2;
   int C1;
   int counted;
   int centAmt;
		
	//PROMPT user to enter value 
	System.out.print("Enter the cent amount:  ");
   centAmt = keyboardIn.nextInt();
   
   E2 = centAmt / 200;
   counted = centAmt - (E2 * 200);
   
   E1 = centAmt / 100;
   counted = centAmt - (E1 * 100);
   
   C50 = centAmt / 50;
   counted = centAmt - (C50 * 50);
   
   C20 = centAmt / 20;
   counted = centAmt - (C20 * 20);

   C10 = centAmt / 10;
   counted = centAmt - (C10 * 10);

   C5 = centAmt / 5;
   counted = centAmt - (C5 * 5);

   C2 = centAmt / 2;
   counted = centAmt - (C2 * 2);

   C1 = centAmt / 1;
   counted = centAmt - (C1 * 1);


      		
	//DISPLAY
   System.out.print(+centAmt, "is made up of: " +E2 +"$2" +E1 +"$1" +C50 +"50C" +C20 +"20C" +C10 +"10C" +C5 +"5C" +C2 +"2C" +C1 +"1C");

  }//end main
}//end class
