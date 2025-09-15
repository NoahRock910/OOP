/* Adapt this program so that the user can input the initial deposit, the
number of years and the interest rate. The user should be asked to
enter the new interest rate for each year. */
import java.util.*;
public class Q9
{
   public static void main(String[] args)
   {    
      int years;
      double deposit, orBal, iRate, total;
         
      Scanner keyboardIn = new Scanner(System.in);
      
      System.out.print("Enter the amount of years: ");
      years = keyboardIn.nextInt();
      
      System.out.print("Enter your deposit: ");
      deposit = keyboardIn.nextDouble();

      System.out.print("Enter the intrest rate (Decimal): ");
      iRate = keyboardIn.nextDouble();
      
      total = deposit;

      for(int count = 1; count <= years; count++)
      {
        total = total+ (total*iRate);
        System.out.println("Year:" +count);
        System.out.println("Bank Balance:" +total);
      } //end for
      System.out.println("The total intrest earned over " +years +" years is: " +(total - deposit));
   } //end main method
} //end class

