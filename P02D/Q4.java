/*Write a program that will accept a person’s details, (name, age and height)
and will determine whether or not he/she is a suspect in a crime. The
crime was committed by a male between 20 and 30 years of age and
between 1.6 and 1.75 meters tall. The program should display one of the
following messages depending on whether or not the person fits the
description.
Sean is a suspect and should be interrogated
or
Sean is not a suspect and should be released */
import java.util.Scanner;
public class Q4
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
   
      //Initilising Variable
      String gender;
      String name;
      int age;
      double height;
   
      //Recive variable
      System.out.print("Enter your gender: ");
      gender = keyboardIn.next();
      gender = gender.toUpperCase();
      
      System.out.print("Enter your name: ");
      name = keyboardIn.next();
      name = name.toUpperCase();
      
      System.out.print("Enter your age: ");
      age = keyboardIn.next();
      gender = gender.toUpperCase();


   
      //If statement
      if(gender.equals("MALE"))      
      {
         System.out.println("You are a Male");
      }
      else if(gender.equals("FEMALE"))
      {
         System.out.println("You are a Female");
      }
      else
      {
         System.out.print("You are neither Male or Female");
      }

 } //end main method
} //end class
