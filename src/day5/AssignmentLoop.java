package day5;

public class AssignmentLoop {

	public static void main(String[] args) {
          // ______________________Assignment :- While loop __________________________________________________________________
		
			
		
		System.out.println("<---------------------------Assignment of Loop ------------------------> ");
		
		
		
	}
	
	
	public class PNoOneTwoTen
	{
		public static void main(String[] args) 
		{
		
		// Question No:1 ---> 1. Write a Java program to print numbers from 1 to 10 using a while loop.
        
		      int i= 1;
		           while(i<=10)
		                {
		                        	System.out.println(i);
			
			                          i++;
			
		                }
	     }
	 }
	//------------------------------------------------------
	

	
	public class SumOfTheFirstTenNumber
	{
		
		public static void main(String[] args)
		{
			
			//2. Write a Java program to calculate the sum of the first 10 natural numbers using a while loop.
			
			int sum =0;
			int i=1;
			while(i<=10) 
			{
				sum+=i;
				
				i++;
				
			}
			
			System.out.println("The sum of first 10 natural number is : "+sum);
			

			
		}
		
		
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	//3. Write a Java program to calculate the factorial of a given number using a while loop.
	public class Factorial {
	    public static void main(String[] args) {
	        int n = 5;
	        int fact = 1;
	        int i = 1;

	        if (n == 0 || n == 1) {
	            System.out.println("Factorial of " + n + " is: 1");
	        } else {
	            while (i <= n) {
	                fact = fact * i;
	                i++;
	            }
	            System.out.println("The factorial of the given number is: " + fact);
	        }
	    }
	}

	//----------------------------------------------------------------------------------------------------------------
	// ----------4. Write a Java program to reverse a given number using a while loop.
         public class Reverse
         {
              public static void main(String[] args)
              {
            	  
            	  int reverse = 0;
            	  
            	  int n= 2345;
            	
            	  while(n>0) {
            		  int lastdigit = n %10;
            		  
            		  reverse = reverse * 10 +lastdigit;
            		  
            		  n = n/10;
            		  
            		  
            		  
            	  }
            	  
            System.out.println("The reverse of given number is :" +reverse);
				
			}	 
         }
	
	//----------------------------------------------------------------------------------------------------------------
	
}

