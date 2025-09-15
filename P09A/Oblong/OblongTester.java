/*
	Written by : Maeve Carr
	Date:
	Desc:
*/

public class OblongTester
{
   public static void main(String [] args)
   {  
	   // create an instance of type Oblong
	   Oblong ob1 = new Oblong();
	   
	   // use methods to set instance variables
	   ob1.setHeight(10);
	   ob1.setWidth(20);
	   
	   // use methods to retrieve values of instance variables
	   System.out.println("Width: " + ob1.getWidth());
	   System.out.println("Height: " + ob1.getHeight());   
	   System.out.println("Area: " + ob1.calculateArea());
         
   }
}
