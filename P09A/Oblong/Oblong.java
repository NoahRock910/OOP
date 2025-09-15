// Oblong Class
// Class representing a four sided rectangular shape

public class Oblong
{
	// instance variables
	private double height;
	private double width;
   
   //Constructers
   public Oblong()
   {
     height = 0.0;
     width = 0.0;
   }
   
   public Oblong(double inHeight, double inWidth)
   {
     if(inHeight < 0 || inWidth < 0)
     {
      Height = 0.0
      Width = 0.0
     }
      
     height = inHeight;
     width = inWidth;
   }

	// methods
	public double getHeight()
	{	
		return height;		
	}

	public double getWidth()
	{	
		return width;		
	}

	public void setWidth(double widthIn)
	{	
		width = widthIn;
	}

	public void setHeight(double heightIn)
	{	
		height = heightIn;
	}
	
	public double calculateArea()
	{	
		return width * height;
	}	
	
	public double calculatePerim()
	{	
		return (width + height) * 2;
	}	
	
	public boolean isSquare()
	{
		// if(width == height)
// 			return true;
// 		else
// 			return false;
		return width == height;
	}
	
	//accessSpec returnType name(arg_list)
	public void grow(double wAmt, double hAmt)
	{
		width += wAmt; //width = width + wAmt;
		height += hAmt;
	}


}// end of class