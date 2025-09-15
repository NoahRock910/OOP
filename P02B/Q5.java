//Write a program that will ask the user to enter hours worked and rate of pay for an employee and will calculate and display the employee’s wages. 
//If the employee has worked overtime (over 38 hours) allow them time and a half for the extra hours worked and display the overtime due
import java.util.Scanner;
public class Q5
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
   
      //Initilising Variable
      double wage, overTime, andAHalf, overSalary, salary, tSalary;
      int hours;
   
     //Recive variable
      System.out.print("Please enter your rate of pay: ");
      wage = keyboardIn.nextDouble();
      
      System.out.print("Please enter your hours worked: ");
      hours = keyboardIn.nextInt();
   
      //If statemene
      if(hours > 38)
      {
         hours = hours - 38;
         salary = wage * 38;
         andAHalf = wage * 0.50;
         overTime = wage + andAHalf;
         overSalary = overTime * hours;
         
         System.out.println("Your wage is: " +salary);
         System.out.println("Your overtime revenue is : " +overSalary);
         
         tSalary = overSalary + salary;
         System.out.println("Your total revenue is : " +tSalary);
      }
      else
      {
         salary = wage * hours;
         System.out.println("Your wage is: " +salary);
      }
   } //end main method
} //end class
