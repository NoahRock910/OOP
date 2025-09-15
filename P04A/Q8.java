


/* Write a program to calculate and display the amount of money in a
bank account that was opened with a deposit of €20 fifteen years ago
and has earned interest at 10% (compound interest) per annum. Your
program should display the amount of money in the account at the
end of each year for all of the 15 years. Your program should also
display the total interest earned at the end of 15 years. */
public class Q8
{
   public static void main(String[] args)
   {    
      int years = 15;
      double intr = 0.10, total = 20, orBal, totIntr =  0, interest;
      orBal = total;
    
    //   for(int count = 1; count <= years; count++)
//       {
//          total = total+ (total*intr);
//          System.out.println("Year:" +count);
//          System.out.println("Bank Balance:" +total);
//       } //end for
//       System.out.println("The total inrtest earned over " +years +"years is: " +(total - orBal));
    
    
     for(int count = 1; count <= years; count++)
      {
         interest = total * intr;
         total = total+ interest;
         totIntr = totIntr + interest;
         
         System.out.println("Year:" +count);
         System.out.println("Bank Balance:" +total);
      } //end for
      System.out.println("The total inrtest earned over " +years +" years is: " +totIntr);
    

   } //end main method
} //end class
