public class PartTimeEmployee extends Employee
{
  //New Instance Variable
  private double hourlyPay;

  
  //Consruct
  public PartTimeEmployee(String empName)
   {  
     super(empName);
   }

  
  public void setHourlyPay(double initialHP)
  {
    hourlyPay = initialHP;
  }
  
  public double getHourlyPay()
  {
    return hourlyPay;
  }
  
  public double getWeekWage(double hoursWorked)
  {
    double weekWage = hourlyPay * hoursWorked;
    return weekWage;
  }
}