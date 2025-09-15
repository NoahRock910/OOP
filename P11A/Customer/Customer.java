/**
   A customer with a name, number and a balance.
*/
public class Customer
{ 
   private String name;
   private int idNumber;
   private double balance;
	
   public Customer(String nameIn, int idNoIn)
   {  
		name = nameIn;
		idNumber = idNoIn;
		balance = 0;
   }
   
   public String getName()
   {  
      return name;
   }
    
   public int getIdNumber()
   {  
      return idNumber;
   }
   
   public double getBalance()
   {  
      return balance;
   }

   public void makePurchase(double amt)
   {
		balance += amt;
   }

   public void makePayment(double amt)
   {
		balance -= amt;
   }

}

