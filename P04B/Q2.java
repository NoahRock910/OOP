/* The following piece of Java code will generate a random number between 0 and 9.
Random noGenerator = new Random();
//declare variable to store random no btw 0 and 9
int randomNumber;
randomNumber = noGenerator.nextInt(10);
Type up this code and run it. Adapt this code to write a program that will simulate
the throwing of a die (single dice).
Adapt the code to write another program that will simulate the throwing of two
dice. The program should report the value on each die and the total value thrown.
Anytime doubles is thrown (i.e. both dice values are equal) the dice should be rethrown. */
import java.util.*;
public class Q2
{
  public static void main(String[] args)
  {
    Scanner keyboardIn = new Scanner(System.in);
    
    Random noGenerator = new Random();
    
    int diceThrw1 =0, diceThrw2 =0, total;
    
    while(diceThrw1 == diceThrw2)
    {
      diceThrw1 = noGenerator.nextInt(6) + 1;
      diceThrw2 = noGenerator.nextInt(6) + 1;
    
      System.out.println("Dice throw 1: " +diceThrw1);
      System.out.println("Dice throw 2: " +diceThrw2);
    
      total = diceThrw1 + diceThrw2;
      System.out.println("The total of both dice throws is: " +total);
    }
           
  } //end main method
} //end class
