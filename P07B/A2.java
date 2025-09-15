import java.awt.Rectangle;
public class A2
{
  public static void main(String[] args)
   {    
     int xVal, yVal, height, weight;
     
     Rectangle r1 = new Rectangle(10,10,8,6);
     
     System.out.println(r1.getX());
     System.out.println(r1.getY());
     System.out.println(r1.getWidth());
     System.out.println(r1.getHeight());
     
     System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________________");     
     //Translation
     r1.translate(5,8);
     
     System.out.println(r1.getX());
     System.out.println(r1.getY());
     System.out.println(r1.getWidth());
     System.out.println(r1.getHeight());
     
     System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________________");
     //Negative Translation
     r1.translate(-15,-18);
     
     System.out.println(r1.getX());
     System.out.println(r1.getY());
     System.out.println(r1.getWidth());
     System.out.println(r1.getHeight());
     
   }
}