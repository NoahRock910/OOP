public class A1
{
   public static void main(String[] args)
   {    
      //Varibles
      int half, sp1, sp2, valOfA;
      
      String s = "java is fun";
      
      //Print
      System.out.println("The string is: "+s);
      
      //Length
      System.out.println("The length of the string is "+ s.length());
      
      //1st charcter
      System.out.println("The first charcter in the string is "+ s.charAt(0));
      
      //Last charcter
      System.out.println("The last charcter in the string is "+ s.charAt(s.length()-1));
      
      //Mid Charcter
      half = s.length() / 2;

      if(half % 2 != 0)
        System.out.println("The mid charcter in the string is "+ s.charAt(half));
      else 
       System.out.println("The mid charcters in the string are "+ s.charAt(half-1) +" " +s.charAt(half));
       
      //1st word
      sp1 = s.indexOf(' ');
      System.out.println("The first word in the string is: " +s.substring(0,sp1));
      
      //2nd word
      sp2 = s.indexOf(' ',sp1 +1);
      System.out.println("The second word in the string is: " +s.substring(sp1,sp2));
      
      //UPPERCASE
      System.out.println(s.toUpperCase());
      
      //lowercase
      System.out.println(s.toLowerCase());
      
      //Replace a with @
      valOfA = s.indexOf('a');
      
      StringBuffer replaceS = new StringBuffer(s); 
      replaceS.setCharAt(valOfA, '@'); 
  
      // Print the modified string 
      System.out.print("Modified String = " + replaceS);
      

      
   }
}
