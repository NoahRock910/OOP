import java.util.Scanner;
import java.awt.Rectangle;
public class A1
{
  public static void main(String[] args)
   {    
     int xVal, yVal, height, width;
     Rectangle r1 = new Rectangle();
     Rectangle r2 = new Rectangle();
     
   
     Scanner keyIn = new Scanner(System.in);
     
     for(int i = 0; i < 2; i++)
       {
         System.out.print("Type in the x value of the rectangle :");
         xVal = keyIn.nextInt();
     
         System.out.print("Type in the y value of the rectangle :");
         yVal = keyIn.nextInt();
     
         System.out.print("Type in the height value of the rectangle :");
         height = keyIn.nextInt();
     
         System.out.print("Type in the width value of the rectangle :");
         width = keyIn.nextInt();
         
         if(i == 0){
            r1.setSize(height,width);
            r1.setLocation(xVal,yVal);
         }
         else
         {
            r2.setSize(height,width);
            r2.setLocation(xVal,yVal);
         }  
       }     
     
     System.out.println("Rectangle 1:");
     System.out.println("coords are (" + r1.getX() +", " +r1.getY() +")");
  
     System.out.println(r1.getWidth());
     System.out.println(r1.getHeight());
     
     System.out.print("");
     
     System.out.println("Rectangle 2:");
     System.out.println("coords are (" + r2.getX() +", " +r2.getY() +")");
     System.out.println(r2.getWidth());
     System.out.println(r2.getHeight());
   }
}