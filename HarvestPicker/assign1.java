/* Written By Noah 
   October 17     */
import java.util.*;
public class assign1
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //Intilasing variable for amount of baskets collected
      int bsktCollect, smll, med, larg, paySmll, payMed, payLarg, totalEarn, counter = 0, topHarvester = 0, totalSmll = 0, totalMed = 0, totalLarg = 0;
      double netTotal, topTotal = 0, amtPaid2All = 0;
      
      //Used to keep loop going if another harvester needs to be proccesed. I understand char can be used but there is no char to upper/lower
      String othPicker;
      
      do{
         //What harvester is being proccesed
         counter = counter + 1;
         
         System.out.println("Harvester #" +counter);
         
         System.out.print("How many baskets did you collect?: ");
         bsktCollect = keyboardIn.nextInt();
         
         //Asking user to enter how much of what bag they collected
         System.out.println("How many small baskets did you collect?: ");
         smll = keyboardIn.nextInt();
            
         System.out.println("How many medium baskets did you collect?: ");
         med = keyboardIn.nextInt();
            
         System.out.println("How many large baskets did you collect?: ");
         larg = keyboardIn.nextInt();
            
         if (smll+med+larg != bsktCollect)
         {
            System.out.println("You cant cheat the system, not when Noah codes it.");
            break;
         }
         else
         {
            //Calculations
            paySmll = smll * 5;
            payMed = med * 7;
            payLarg = larg * 10;
              
            totalEarn = paySmll + payMed + payLarg;
              
            //Discount. Checks the higher discount because if it checked lower there would never be the 35 discount. totalEarn is changed to netTotal so that both can show up in the display.
            if(totalEarn >= 35)
               netTotal = totalEarn + (totalEarn * 0.10);
            else if(totalEarn >= 25)
               netTotal = totalEarn + (totalEarn * 0.20);
            else
               netTotal = totalEarn;
            
            //Display
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("The number of small baskets filled were: " +smll);
            System.out.println("The number of medium baskets filled were: " +med);
            System.out.println("The number of large baskets filled were: " +larg);
            System.out.println("The total you were paid for that was " +totalEarn);
            System.out.println("The value of the bonus recived was: " +(netTotal - totalEarn));
            System.out.println("The total amount this harvester has earned is: " +netTotal); 
            
            //Used to make calculations at the end
            if (netTotal > topTotal)
            {
               topTotal = netTotal;
               topHarvester = counter;
            }
            
            totalSmll = totalSmll + smll;
            totalMed = totalMed + med;
            totalLarg = totalMed + larg;
            
            amtPaid2All = amtPaid2All +netTotal;
         } 
                   
         System.out.println("--------------------------------------------------------------------------------------");
         System.out.print("Process another fruit harvester? (Y/N): ");
         othPicker = keyboardIn.next();
              
      }while(othPicker.equalsIgnoreCase("Y"));
      
      
      //Final display after all harvesters proccesed
      System.out.println("--------------------------------------------------------------------------------------");
      System.out.println("The total amount of harvester procesed was: " +counter);
      System.out.println("The total amount of small baskets harvested was: " +totalSmll);
      System.out.println("The total amount of medium baskets harvested was: " +totalMed);
      System.out.println("The total amount of large baskets harvested was: " +totalLarg);
      System.out.println("The total amount paid was: " +amtPaid2All);
      System.out.println("The best harvester was: " +topHarvester);
      System.out.println("They earned: " +topTotal);
      
   } //end main method
} //end class
