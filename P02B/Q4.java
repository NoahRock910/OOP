//Write a program that will read in the price of 3 different books from the user and will calculate and display the total amount owing. 
//If the total price is greater than 50.00 a 10% discount will be given. Display total due.
import java.util.Scanner;
public class Q4
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
   
   //Initilising Variable
      double boPrice, tPrice, discount, gPrice;
   
      gPrice = 0;
   //Recive variable
      for (int counter = 0; counter < 3; counter++)
      {
         System.out.print("Please enter the price of the book: ");
         boPrice = keyboardIn.nextDouble();
         gPrice = gPrice + boPrice;
      }
   
   //If statement
      if(gPrice > 50)
      {
         discount = gPrice * 0.10;
         tPrice = gPrice - discount;
         System.out.println("The total amount due is: " +tPrice);
      }
      else
      {
         System.out.println("The total amount due is: " +gPrice);
      }
   } //end main method
} //end class
