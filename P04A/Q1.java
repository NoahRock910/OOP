/* Write a program using the for loop, which will ask the user to enter a
value n, and will print n stars on screen. */
import java.util.*;
public class Q1
{
  public static void main(String[] args)
  {
    Scanner keyboardIn = new Scanner(System.in);
    
    int num;
    
    System.out.print("Enter the amount of starts you want: ");
    num = keyboardIn.nextInt();

    for(int count = 1; count <= num; count++)
    {
      System.out.print("*");
    } //end for
  } //end main method
} //end class
