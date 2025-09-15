import java.util.Scanner;
import java.awt.Rectangle;
public class A3
{
  public static void main(String[] args)
   {    
     int xVal, yVal, height, weight;
   
     Scanner keyIn = new Scanner(System.in);
     
     System.out.print("Type in the x value of the rectangle :");
     xVal = keyIn.nextInt();
     
     System.out.print("Type in the y value of the rectangle :");
     yVal = keyIn.nextInt();
     
     System.out.print("Type in the height value of the rectangle :");
     height = keyIn.nextInt();
     
     System.out.print("Type in the width value of the rectangle :");
     width = keyIn.nextInt();
     
     
     
     Rectangle r1 = new Rectangle(xVal,yVal,height,width);
     
     System.out.println(r1.getX());
     System.out.println(r1.getY());
     System.out.println(r1.getWidth());
     System.out.println(r1.getHeight());
     
   }
}