/* Write a method called formatTime(int, int) that will accept two integer
values for hours and minutes and will print the time in the format hh:mm.
Use the printf() method. */
/* Written By Noah 
   October 18     */
//import java.util.Formatter; 
import java.util.*;
public class Q4
{
   public static void main(String[] args)
   {
     Scanner keyboardIn = new Scanner(System.in);
   
     int hrs,mins;
     
     System.out.print("Enter hours: ");
     hrs = keyboardIn.nextInt();
     
     System.out.print("Enter minutes: ");
     mins = keyboardIn.nextInt();

     formatTime(hrs,mins);    
   }
   
   //Prints a clear line
   public static void formatTime(int hh,int mm)
   {
     System.out.printf("%02d:%02d" , hh ,mm);
   }
}