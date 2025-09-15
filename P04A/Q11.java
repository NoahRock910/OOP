/* The Fibonacci series is as follows;
0, 1, 1, 2, 3, 5, 8, 13, 21, 34…
After the first 2 numbers, each number is the sum of the two previous
numbers. Write a program to compute the nth term in the series.
Have your program to print the series to the nth term. */
import java.util.*;
public class Q11
{
  public static void main(String[] args)
  {
    Scanner keyboardIn = new Scanner(System.in);
    
    int n, intOne = 0, intTwo = 0, intThr = 0;
    
    System.out.print("Enter how long you want the Fibonacci to go on to: ");
    n = keyboardIn.nextInt();
        
    for(int count = 0; count <= (n+1); count++)
    {
        if(count > 2)
          count = count - 1;
         
        System.out.print(count +",");
        intTwo = intOne;
        intOne = count;
        count = intOne + intTwo;
    } //end for
  } //end main method
} //end class
