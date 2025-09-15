/* Write a program which will ask the user to enter a number and will
determine if the number is a prime number. (A prime number is a
positive integer whose only factors are itself and 1). 1 is not a prime
number. HINT: use a flag variable or break. */
import java.util.*;
public class Q10
{
  public static void main(String[] args)
  {
    Scanner keyboardIn = new Scanner(System.in);
    
    int n;
    boolean isItPrimeFlag = true;
    
    System.out.print("Enter a int value: ");
    n = keyboardIn.nextInt();
        
    for(int count = 2; count < n; count++)
    {
       if (n % count == 0)
         isItPrimeFlag = false;
    } //end for
    if((isItPrimeFlag) && (n != 1))
      System.out.print(n +" is a prime number");
    else
      System.out.print(n +" isnt a prime number");
  } //end main method
} //end class
