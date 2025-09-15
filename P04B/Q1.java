/* Write a program that will find the highest common factor of two integer values
entered by the user. The highest common factor is the highest number that will
divide evenly into both.
The highest common factor of
4 and 2 is 2
16 and 24 is 8. */
import java.util.*;
public class Q1
{
  public static void main(String[] args)
  {
    Scanner keyboardIn = new Scanner(System.in);
    
    int num1, num2, hCF = 0, bigNum, i;
    
    System.out.print("Enter the first int value: ");
    num1 = keyboardIn.nextInt();
    
    System.out.print("Enter the second int value: ");
    num2 = keyboardIn.nextInt();
    
    if (num1 > num2)
      bigNum = num1;
    else
      bigNum = num2;
    
    for(i = 1; i<=bigNum;i++)
    {
      if (num1%i == 0 && num2%i == 0)
        hCF = i;
    }
    System.out.print("The HCF is " +hCF);
        
  } //end main method
} //end class
