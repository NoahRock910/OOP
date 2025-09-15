/***************************************
Written By: Maeve Carr
Desc: program to 
Date: 
File: 
   
******************************************/


/**
   An employee with a name and number.
*/
public class Employee
{ 
   private String name;
  	private int idNumber;
	private static int nextNumber = 1;
	
   /**
      Constructs an employee.
      @param empName the employee name
     
   */
   public Employee(String empName)
   {  
      name = empName;
		idNumber = nextNumber++;
   }
   
   /**
      Gets the employee name.
      @return the employee name
   */
   public String getName()
   {  
      return name;
   }
    /**
      Gets the employee num.
      @return the id number
   */
   public int getIdNumber()
   {  
      return idNumber;
   }
		

   
}
