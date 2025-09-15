/* Write a program that will calculate the sum of all integers in the
range 1 to 100 that are evenly divisible by 7 or 4. */
public class Q5
{
  public static void main(String[] args)
  {    
    int total = 0;
    
    for(int count = 1; count <= 100; count++)
    {
      if (count % 4 == 0 || count % 7 == 0)
        total = total +count;
    } //end for
    
    System.out.print("The sum of all integers from the range 1 to 100 that are evenly divisible by 7 or 4 is: " +total);
  } //end main method
} //end class

