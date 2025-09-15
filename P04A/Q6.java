/* Write a program using a for loop to find the sum of all the even
integers in the range m to n, where m and n are determined by the
user. Ensure that m is lower than n. */
import java.util.*;
public class Q6
{
  public static void main(String[] args)
  {
    Scanner keyboardIn = new Scanner(System.in);
    
    int m, n, total = 0;
    
    System.out.print("Enter the starting value for the program: ");
    m = keyboardIn.nextInt();
    
    System.out.print("Enter the ending value for the program: ");
    n = keyboardIn.nextInt();
    
    if (m >= n)
      System.out.print("You have made the starting value higher then the ending value");
    else
    {
      for(int count = m; count <= n; count++)
      {
        if (count % 2  == 0)
        {
          total = total +count;
          //System.out.println(count);
        }
      } //end for
      System.out.print("The sum of all integers from the range "+m +" to "+n +" that are evenly divisible by 2 is: " +total);
    }
  } //end main method
} //end class
