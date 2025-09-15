/* Write a program that will calculate the sum of all integers in the
range 1 to 100. */
public class Q2
{
  public static void main(String[] args)
  {    
    int total = 0;
    
    for(int count = 1; count <= 100; count++)
    {
      total = total +count;
    } //end for
    
    System.out.print("The sum of all integers from 1 to 100 is: " +total);
  } //end main method
} //end class
