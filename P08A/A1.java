import java.util.*;
//import java.Oblong;
public class A1
{
   public static void main(String [] args)
   {
      Scanner keyIn = new Scanner(System.in);
      
      double width, height;
      
      Oblong o1 = new Oblong();
      
      System.out.print("Type in the height value of the oblong :");
      height = keyIn.nextDouble();
     
      System.out.print("Type in the width value of the oblong :");
      width = keyIn.nextDouble();
      
      o1.setHeight(height);
      o1.setWidth(width);
      
      System.out.println("Width: "+ o1.getWidth());
      System.out.println("Height: "+ o1.getHeight());
      
      System.out.println("Area: "+ o1.calculateArea());
      
      //System.out.print("WEEEED");
    }
}
      
      
