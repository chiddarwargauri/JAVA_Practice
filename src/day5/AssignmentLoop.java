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
         //6.  Write a Java program to check if a given number is a prime number using a while loop. 
        
         public class Prime
         {
        	 public static void main(String[] args)
        	 
        	 {
				     int n=4;
				     int i = 2;
				     
				     boolean isPrime =true;
				     while(i<n)
				     {
				    	 
				    	 if(n%i==0) 
				    	 {
				    		 isPrime =false;
				    				 break;
				    	 }
				    	 
				    	 i++;
				    	 
				    	
				     }
				     
				     if(isPrime) 
			    	 {
			    		System.out.println("this nmber is prime"); 
			    	 }
			    	 
			    	 else 
			    	 {
			    		 System.out.println("This number is not prime ");
			    	 }
			    	 
				 
				 
			}
         }
         
     //---------------------------------------------------------------------------------------------------------------
         
         
         
         //5.  Write a Java program to count the number of digits in a given number using a while loop. 
         
         
         public class CountDigit
         {
        	 public static void main(String[] args)
        	  {
        		 
        		 int count = 0;
        		 int num = 123467999;
        		 
        		 while(num>0) 
        		  {
        			 num = num / 10;
        			 
        			 count ++;
        			 
        		  }
        		 
        		 System.out.println("the number of digit in the given number is : " +count);
				
			  }
         }
         
     //---------------------------------------------------------------------------------------------------------------
         
         //8.  Write a Java program to calculate the sum of digits of a given number using a while loop. 
         public class SumDigit
         {
        	 public static void main(String[] args)
        	 
        	 {
        		 System.out.println("___________________________________________calculate the sum of digits of a given number__________________________________________");
        		 
        		 int  num= 5419;
        		 
        		 int sum= 0;
        		 
        		 while(num>0)
        		 {
        			 int lastdigit = num%10;
        			 sum +=lastdigit;
        			 num=num/10;
        			 
        		 }
        		 
        		System.out.println("the sum of digits of a given number is: "+sum);
				
			}
         }
         
         
     //--------------------------------------------------------------------------------------------------------------
         
         // 11.  Write a Java program to check if a given number is a palindrome using a while loop.
         
         
           public class Palindrome
           {
        	   public static void main(String[] args)
        	   
        	   {
        		   
        		int num = 1145;
        		int original ;
        		original=num;
        	
        		int reverse = 0;
        		
        		while(num>0) {
        			
        			int lastdigit = num% 10;
        			reverse = reverse *10 +lastdigit;
        			num=num/10;
        		}
        		
        		   if(reverse == original) 
        		   {
        			   System.out.println(true);
        		   }
        		   else
        		   {
        			   System.out.println(false);
        		   }
				
		     	}
           }
           
      //-------------------------------------------------------------------------------------------------------------
         // *    10. Write a Java program to generate the first 10 numbers of the Fibonacci series using a while loop.
           //F(n) = F(n-1) + F(n-2)

           public class Fibonacci{
        	   public static void main(String[] args) {
				int n =2 ;
				 if(n==0) {
					 System.out.println("the fibonacii of 0 : 0");
					 
				 }
				 
				 if(n==1) {
					 System.out.println("the fibonacii of 1: 1");
					 
				 }
				
				while(n<=10) 
				{    
					
					n= (n-1) +(n-2);
					n++;
				}
				System.out.println(n);
				
			}
           }

           

         
	//----------------------------------------------------------------------------------------------------------------
	
}

