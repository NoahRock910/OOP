/* Change your method in the previous example to take two int parameters,
and print out the numbers between num1 and num2
public static void displayNumbers(int num1, int num2)
Write Java code in your main method to read in two numbers from the user,
then call this method. */
/* Written By Noah 
   October 18     */
import java.util.*;
public class Q3
{
   public static void main(String[] args)
   {
     Scanner keyboardIn = new Scanner(System.in);
   
     int num1,num2;
     
     System.out.print("Enter the first int value: ");
     num1 = keyboardIn.nextInt();
     
     System.out.print("Enter the second int value: ");
     num2 = keyboardIn.nextInt();

     displayNumbers(num1,num2);    
   }
   
   //Prints a clear line
   public static void displayNumbers(int num1,int num2)
   {
     for(int i = num1; i <= num2; i++)
       System.out.print(i + " ");
   }
}