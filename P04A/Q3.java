/* Write a program that will calculate the sum of all integers in the
range 1 to 100 that are evenly divisible by 3. */
public class Q3
{
  public static void main(String[] args)
  {    
    int total = 0;
    
    for(int count = 1; count <= 100; count++)
    {
      if (count % 3 == 0)
        total = total +count;
    } //end for
    
    System.out.print("The sum of all integers from 1 to 100 that are evenly divisible by 3 is: " +total);
  } //end main method
} //end class
