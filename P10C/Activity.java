/*  Written By:  Noah Mclaughlin
	 Date:
	 Desc:
	 File:
*/

public class Activity
{
  //Instance fields
  private String name;
  private double cBPM;
  private double calsBurned;
  
  //Constructors
  public Activity(String activityName, double calsBurnedPerMin)
  {
    name = activityName;
    cBPM = calsBurnedPerMin;
  }
  
  //Methods
  public String getName()
  {
    return name;
  }
  
  public double getCBPM()
  {
    return cBPM;
  }
  
  public double getCaloriesBurned(double minsOfActivity, double pounds)
  {
    calsBurned = ((cBPM * minsOfActivity) * pounds);
    return calsBurned;
  }
  
   public String toString()
   {
     return "Activity name: " + name + "\t" + "Number of cals burned per min: " +cBPM ;
   }

}