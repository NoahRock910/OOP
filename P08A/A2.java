import java.util.*;
//import java.Oblong;
public class A2
{
   public static void main(String [] args)
   {
      Scanner keyIn = new Scanner(System.in);
      
      double width, height, area;
      int counter = 1;
      
      Oblong o1 = new Oblong();
      Oblong o2 = new Oblong();
      
      
      for(int i = 1; i < 3; i++)
      {     
         System.out.print("Type in the height value of oblong #"+i +": ");
         height = keyIn.nextInt();
     
         System.out.print("Type in the width value of oblong #"+i +": ");
         width = keyIn.nextInt();
         
         if(i == 1)
         {
            o1.setHeight(height);
            o1.setWidth(width);
         }
         else
         {
            o2.setHeight(height);
            o2.setWidth(width);
         }  
      } 
     
     //Displaying the variables of each oblong  
     System.out.println("Oblong 1:");
  
     System.out.println("Width: "+o1.getWidth());
     System.out.println("Height: "+o1.getHeight());
     
     System.out.print("");
     
     System.out.println("Oblong 2:");
     
     System.out.println("Width: "+o2.getWidth());
     System.out.println("Height: "+o2.getHeight());
     
     //Calculating biggest area
     System.out.print("");
     
     area = o1.calculateArea();
     
     if(o2.calculateArea() > area)
     {
       area = o2.calculateArea();
       counter = 2;
     }
     else if(o2.calculateArea() == area)
       area = -1;
       
     if(area > 0)
       System.out.print("Oblong #"+ counter +" has the biggest area");
     else
       System.out.print("The areas of both oblongs are equal");
   
   }
}
      
      
