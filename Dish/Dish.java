/*
	Written by : Noah Mclaughlin
	Date: 13th december
	Desc: creating dish class
*/

public class Dish
{
   private String name;// name of the dish e.g. chicken curry
   private double price; //The price of 1 adult portion
   private int calories;  //calories per portion

   public Dish(String name,  double price, int calories){
      this.name=name;
      this.price=price;
      this.calories = calories;
   }
   
 //methods
   public String getName() {
      return name;
   }
  
   public double getPrice(){
      return price;
   }
   
   public double getCalories(){
      return calories;
   }
   
   //------------insert your code here for toString()
   public String toString(){
     return name +":" + "  @ "+price+"; "+"Cals per portion: "+calories;
   }
   
   
    //------------insert your code here for equals()
   public boolean equals(String name1)
   {
     if (name == name1)
       return true;
     else
       return false;
   }
   
}
