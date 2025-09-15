/*
	Written by : Maeve Carr
	Date:
	Desc:	A program that will .....
	FileName: 
*/

// Employee class


public class Employee
{
	// instance variables
	private int empNo;
	private double salary;
	private String name;
   
   //Constructers
   public Employee()
   {
     
   }

	// methods
	
	public void setEmpNo(int empNoIn)
	{	
		empNo = empNoIn;		
	}

	public int getEmpNo()
	{	
		return empNo;		
	}

	public void setName(String nameIn)
	{	
		name  = nameIn;		
	}
	
	public String getName()
	{	
		return name;		
	}
	
	public void setSalary(double salaryIn)
	{	
		salary  = salaryIn;		
	}
	
	public double getSalary()
	{	
		return salary;		
	}
	
	public void raiseSalary(double raise)
	{
		salary += raise;
	}
	
	public void reduceSalary(double reduction)
	{
		salary -= reduction;
	}
	public double calcMonthlyPay()
	{
		return salary/12;
	}
	
	public double calcWeeklyPay()
	{
		return salary/52;
	}
	public double calcBonus(double percentBonus)
	{
		return  salary * (percentBonus/100);
	}


}// end of class