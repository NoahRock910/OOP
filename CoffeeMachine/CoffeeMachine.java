/***************************************
Written By: Noah Mclaughlin
Desc: program to create a coffee machine class
Date: 13th december 2023  
******************************************/
public class CoffeeMachine
{ 
  //Instance Variables
  private int maxBeanLvl = 500;
  private int maxWaterLvl = 1000;
  private double oneBeanWeight = 7.5;
  private int oneWaterShot = 30;
  private int exspressosMade = 0;
  
  private double currentBeanLvl;
  private double currentWaterLvl;
  
  //Constructer. Automatically Sets current level at max.
  public CoffeeMachine()
  {
    currentBeanLvl = maxBeanLvl;
    currentWaterLvl = maxWaterLvl;
  }
  
  //Constructer. User inputs starting level.
  public CoffeeMachine(double beanInput, double waterInput)
  {  
    currentBeanLvl = beanInput;
    currentWaterLvl = waterInput;
  }
      
  //Methods
  //Gets the weight for one bean
  public double getOneBeanWeight()
  {  
     return oneBeanWeight; 
  }
  
  //Gets the weight for one shot of water
  public int getOneWaterShot()
  {  
     return oneWaterShot;
  }
  
  //Gets the current bean
  public double getCurrentBeanLvl()
  {
    return currentBeanLvl;
  }
  
  //Gets the current water level
  public double getCurrentWaterLvl()
  {
    return currentWaterLvl;
  }
  
  //Gets max bean level
  public int getMaxBeanLevel()
  {
    return maxBeanLvl;
  }
  
  //Gets max water level
  public int getMaxWaterLevel()
  {
    return maxWaterLvl;
  }
  
  public int getExspressosMade()
  {
    return exspressosMade;
  }

  //Refills the beans of the machine till a user indicated level
  public void refillBeans(double beanInput)
  {
    currentBeanLvl = beanInput;
  }
  
  //Refills bean level to max
  public void refillBeans()
  {
    currentBeanLvl = maxBeanLvl;
  }
  
  //Refills the water of the machine till a user indicated level
  public void refillWater(double waterInput)
  {
    currentWaterLvl = waterInput;
  }
  
  //Refills water level to max
  public void refillWater()
  {
    currentWaterLvl = maxWaterLvl;
  }
  
  //Uses water and bean level to make an exspresso
  public String makeExspresso()
  {
    if (currentWaterLvl > oneWaterShot && currentBeanLvl > oneBeanWeight)
    {
      currentWaterLvl =- oneWaterShot;
      currentBeanLvl =- oneBeanWeight;
      exspressosMade++;
      
      return "Exspresso is ready!"; 
    }
    else
      return "Not enough water or coffee beans to make an Exspresso.";
  }
  
  //Emptys to the machine and sets number of exspressos made, water level and bean level to zero
  public void emptyMachine()
  {
    currentWaterLvl = 0;
    currentBeanLvl = 0;
    exspressosMade = 0;
  }
  
  //Prints out required status text and checks for water and bean levels being low using bool
  public String toString()
  {
    if (currentBeanLvl < 50);
       boolean beanLow = true;
    if (currentWaterLvl < 90);
       boolean waterLow = true;
       
    if (waterLow == true && beanLow == true)      
      return "Current bean weight: "+ currentBeanLvl + "/t" + "Current water level: "+ currentWaterLvl + "/t" + "No standard Espressos made: "+ exspressosMade +"/t" + "Bean level low" + "/t" + "Water level low";
      
    else if (waterLow == true && beanLow == false)      
      return "Current bean weight: "+ currentBeanLvl + "/t" + "Current water level: "+ currentWaterLvl + "/t" + "No standard Espressos made: "+ exspressosMade +"/t" + "Water level low";
      
    else if (waterLow == false && beanLow == true)      
      return "Current bean weight: "+ currentBeanLvl + "/t" + "Current water level: "+ currentWaterLvl + "/t" + "No standard Espressos made: "+ exspressosMade +"/t" + "Bean level low";
      
    else      
      return "Current bean weight: "+ currentBeanLvl + "/t" + "Current water level: "+ currentWaterLvl + "/t" + "No standard Espressos made: "+ exspressosMade;
  } 	
}
