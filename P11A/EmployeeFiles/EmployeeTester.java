/***************************************
Written By: Maeve Carr
Desc: program to 
Date: 
File: 
   
******************************************/

/**
   This program tests the Employee class.
*/
public class EmployeeTester
{  
   public static void main(String[] args)
   {  
  		//create an  object employee of the class Employee    
		Employee e1 = new Employee("Sean Doherty");
		Employee e2 = new Employee("Paul O Donnell");
      PartTimeEmployee pTE1 = new PartTimeEmployee("Noah Mclaughlin");
      
      pTE1.setHourlyPay(10)
		    
	  	//display details
      System.out.println("Emp No: " +e1.getIdNumber() +" Name: " +e1.getName());
      System.out.println("Emp No: " +e2.getIdNumber() +" Name: " +e2.getName());
      System.out.println("Emp No: " +pTE1.getIdNumber() +" Name: " +pTE1.getName());
      System.out.printlm("/t"+"   
      
      
	

	 }
}
