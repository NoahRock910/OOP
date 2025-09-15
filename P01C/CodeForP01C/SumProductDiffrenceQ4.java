//Write a program that will prompt the user to input two integer values and will display the sum, *product and difference.
 import java.util.*;
 public class SumProductDiffrenceQ4 
 {
  public static void main(String[] args)
  {
      Scanner keyboardIn = new Scanner(System.in);

      //DECLARE variable ints
	  	int val1;
      int val2;
      int sum;
      int product;
      int diffrence;
		
      //Q&A
      System.out.print("What is your first integer?: ");
      val1 = keyboardIn.nextInt();
      System.out.print("What is your second integer?: ");
      val2 = keyboardIn.nextInt(); 
      
      //MATH
      sum = val1 + val2;
      product = val1 * val2;
      diffrence = val1 - val2;
      
      if (diffrence < 0) 
      {
        diffrence = diffrence * -1;
      }
       
	  	//DISPLAY SUM
      System.out.println("The sum of both integers is " + sum);
	  	
      //DISPLAY PRODUCT
      System.out.println("The product of both integers is " + product);
      
      //DISPLAY DIFFRENCE
      System.out.println("The diffrence of both integers is " + diffrence);

  }//end main
}//end class
