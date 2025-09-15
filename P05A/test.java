/* Write a Java method that will display the numbers 1 to 80 on screen
 public static void displayNumbers()
 Write Java code in your main method to call this method. */
/* Written By Noah 
   October 18     */

import java.util.Scanner;

public class test
{
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);

   int age = 0;
   String name = "";

   System.out.print("Please enter your Name: ");
   if (input.hasNextLine()) {
     name = input.nextLine();
   }

   System.out.print("Please enter your Age: ");
   if (input.hasNextInt()) {
      age = input.nextInt();
    }

   System.out.println(name);
   System.out.print(age);
   } 
}