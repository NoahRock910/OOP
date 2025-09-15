//Write a program that will read the users gender (male or female) and will
//report if the user is male or female. If any other value is entered an error
//message should be displayed. HINT: use equals() method.
//System.out.println(myStr1.equals(myStr2));
import java.util.Scanner;
public class Q3
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
   
      //Initilising Variable
      String gender;
   
      //Recive variable
      System.out.print("Please enter your gender: ");
      gender = keyboardIn.next();
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
