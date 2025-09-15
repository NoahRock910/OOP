/* 1. Create an array with 100 elements and initialize each element to 10. Do not input
values from keyboard – use a for loop. Display the contents of array. */
import java.util.*;
public class A1
{
  public static void main(String[] args)
  {
    Scanner keyboardIn = new Scanner(System.in);
      
    //create an integer array with 5 integer elements
    int[] myArray = new int[100];
      
    //load the array with value
    for(int i = 0; i<myArray.length; i++)
    {
      myArray[i] = 10;
    }
    
    //Display
    for(int i = 0; i<myArray.length; i++)
    {
      System.out.print(myArray[i] +" ");
    }
  }
}
