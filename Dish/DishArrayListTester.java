/*
	Written by : Noah Mclaughlin
	Date: 13th december
	Desc: testing dish class
*/
import java.util.*; 
public class DishArrayListTester
{
   public static void main(String [] args)
   {  
      Scanner keyIn = new Scanner(System.in);
      
      //1.  Create an ArrayList of Dish objects called dishes
      //------------insert your code here
      ArrayList <Dish> MENU = new ArrayList <Dish>();
     
      
      //- variable declarations
      boolean found = false; 
      int choice;
      String dishName, keyword;
      double price;
      int cals;  
       
      
      //2. Write code to create and add the following Dish objects to the ArrayList dishes.
      //	“CHICKEN SATAY”, with a price of 16 euro and calories 315
      //	A price of 17.50 for “MUSHROOM PASTA”  with 375 calories
      //"SEAFOOD PASTA" at 14.00 euro with 430)); 
      
      //------------insert your code here 
      //You can comment in and out as necessary
      MENU.add(new Dish("Chicken Satay", 16, 315));
      MENU.add(new Dish("Mushroom pasta",17.50,375));
      MENU.add(new Dish("Seafood pasta",14.00,430));
   
   		
      do{
         System.out.println("\n****ATU CAFE MENU****");
         System.out.println("\n1. Add Dish\n2. Display all Dishes (including child portion price) ");
         System.out.println("3. Search for Dish by keyword ");
         System.out.println("4. Delete Dish by name");
         System.out.println("5. Display total no. of Dishes on menu");
         System.out.println("6. Select a  random dish ");
         System.out.println("0. Quit");
         System.out.print("\nSelect option: ");
         choice = keyIn.nextInt();
      	
         switch(choice)
         {
            case 1:	///add a new dish
            			//****IDEALLY YOU should NOT be able to add a dish if it already in list 
                     //- but only attempt this if you have everything else done
            			  
               keyIn.nextLine(); //stop the program skipping - clears the buffer
               System.out.print("Enter name: ");
               dishName = keyIn.nextLine();
               
              // for (int i = 0; i < MENU.size();i++);
              // {
                 //if (equals(dishName, MENU.get(i)) == true)
                  // return "There is already a dish called "+dishName;
               // }   
               System.out.print("Enter price: ");
               price = keyIn.nextDouble();
               System.out.print("Enter Calories per portion : ");
               cals = keyIn.nextInt();
            
               //add a dish
               //------------insert your code here
               MENU.add(new Dish(dishName, price, cals));
                 
                            
               break;						
         	
            case 2:  
            	//view all dishes including price for child portion (half the normal price)
               //in tabular form like this
              // Dish                  Price        Child portion
              // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
               //CHICKEN CURRY              18.00       9.00
              // THAI GREEN CURRY           20.00      10.00
               //BEEF LASAGNE               13.00       6.50
            
               
               System.out.printf("%-20s  %-12s %-12s\n","Dish",  "Price", "Child portion"  );
               System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" );
               //------------insert your code here
               for (int i = 0; i < MENU.size(); i++)
             	{
                 System.out.println(MENU.get(i).getName()+"         "+MENU.get(i).getPrice()+"         "+MENU.get(i).getPrice()/2);
               }
              
               						
               break;
         
            case 3://show all dishes by keyword
            		//display dish name only...
            		 ///keyword search
                   //user can enter any string (any sequence of letters) and it will show 
                   //all dishes containing the word or partial word in name
                    //  IF user enters “Curry” in the name.
                     // i.e. “Thai Green Curry”, “Chicken Curry”, “Curry Chip”.
    
                    				
               keyIn.nextLine(); //stop the program skipping - clears the buffer
               System.out.print("Enter name: ");
               keyword = keyIn.nextLine();
               
               //------------insert your code here	
               for( int i = 0; i < MENU.size(); i++)
               {
                 if (MENU.get(i).equals(keyword) == true);
                 {
                   System.out.println(MENU.get(i).getName());
                   found = true;
              	  }
               }   
                if (found == false)
                  System.out.print("No dishes found with that keyword");
               break;
         
            case 4://delete a dish based on name
            		//ask the user to enter the dish name
                    //    	Write code prompting the user to enter a Dish name. 
            //       The code will then find and remove the dish from the ArrayList. 
            //       If it is removed “<DishName> successfully removed” will be 
            //       displayed otherwise “Could not find <DishName> to remove” will be shown.      
                      
              // keyIn.nextLine();
               //System.out.print("Enter dish to remove: " );
               //dishName = keyIn.nextLine(); 
               
               while (int i = 0; i<1);
                 System.out.println("ITS OVER!");
               
               	//------------insert your code here
              /* for( int i = 0; i < MENU.size(); i++)
               {
                 if (MENU.get(i).equals(MENU.get(i).getName(), dishName) == true);
                 {
                   System.out.println(MENU.get(i).getName());
                   found = true;
                   MENU.remove(i);
              		}
               }   
                if (found == false)
                  System.out.print("No dishes found with that keyword"); */

                              
               break;
         		            
            case 5://display total no of dishes on menu 
            
            		//------------insert your code here
                  System.out.println("The total number of dishes on the menu are: "+ MENU.size());  

                  
                          
               break;
         	
                    
            case 6://select a random dish 
                  //show ONLY the title and author  of book ...as shown
                  // Tonights recommendation :  "BEEF LASAGNE":  @ 13.0; Calories per portion: 419
                  int randomNum = 0 + (int)(Math.random() * ((MENU.size() - 0) + 1));
                  System.out.println("TONIGHTS RECOMMENDATION : "+MENU.get(randomNum));
                  
            
            		//------------insert your code here
               
               break; 
         
                           
            case 0:
               break;
            default: 
               System.out.println("Invalid option entered.");		
         }//end switch
      					
      }while(choice != 0);   
   } //end main     
}