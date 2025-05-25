package day5;

public class Assinment_on_the_or_loop {
	
	
	
	public static void main(String[] args) {
		

	  
		
		
		
	}
	
	

	public class Number{
		
	public static void main(String[] args)
	{
		
		
	 for (int i=1; i<=10;i++) {
		 
		 System.out.println(i);
	 }
		
	}
	
	
	
	
	
	//-------------------------------------------------------
	
	
	
	
	
	
	public class FiveMultiple{
		
		public static void main(String[] args) {
			for(int i = 1 ; i<10;i++) {
				
				
				int five=i*5;
				
				
				System.out.println(five);
			}
		}
	}
	}
	
	//-----------------------------------------------------------------------------
	
	//2. Print Even Numbers from 1 to 20 

	
	public class EvenNumber{
		
		public static void main(String[] args) {
			
			int n= 20;
			for (int i=1; i<=n ;i++) {
				
						
				if(i%2==0)
				{
						System.out.println(i);

				}
				
				
				
			}
		}
	}
	//----------------------------------------------------------------------------------
	
	
      //	3. Print Odd Numbers from 1 to 20 
	
	
	public class OddNumber
	
	{
		public static void main(String[] args) {
			int n = 20;
			for(int i=1; i<= 20; i++) {
				
				if(i%2!=0) {
					System.out.println(i);
				}
				
			}
		}
		
		
	}
	//----------------------------------------------------------------
	// efficient way to solve the problem of the even number 
	
	  public class EEvenNumber{
		  
		  public static void main(String args[])
		  {
			  
			  int n  = 20;
			  for(int i= 2 ; i<=n ; i+=2)
			  
			  {
				  
				  System.out.println(i);
			  }
			  
		  }
	  }
	  //--------------------------------------------------------
	  
	  // effiecient way to solve the problem of the odd number 
	  
	  public class EOddNumber{
		  
		  public static void main(String[] args) {
			int n= 20;
			for(int i=1 ; i<=n ; i+=2) {
				
			System.out.println(i);
			}
		}
	  }
	  
	  //------------------------------------------------------------
    //5. Calculate Sum of Numbers from 1 to 10 

	  public class SumOfNumber{
		  
		public static void main(String[] args) {
			  int num=10 ;
			  int sum= 0;
			  
			  
			  for(int i = 1; i<=num ;i++) {
				  
				  sum+=i;
				  
				
			  }
			  
			  System.out.println(sum);
			  
		}
	  }
	  
	  //--------------------------------------------------------------
	  
	  //6. Print Squares of Numbers from 1 to 5 
	  
	  public class Square{
		  
		  public static void main(String[] args) {
			  int n=5;
			  
				 int  square =0;
				 
				 for(int i=1; i<=n ; i++) {
					 
					 square= i*i;
					 
					 System.out.println("square of " +i+ " is " +square);
				 }
		}
		  
	  }
    // --------------------------------------------------------------------
	  
	  // 7. Print Cube of Numbers from 1 to 5 

	  public class  Cube{
		  public static void main(String[] args) {
			int n=5;
			
			int cube = 0;
			
			for(int i=1;i<=n;i++) {
				cube =i*i*i;
				
				System.out.println("The cube of " +i+ " is "+ cube);
				
				
			}
		}
		  
	  }
	  
	  
	  //8. Print Numbers in Reverse Order from 10 to 1 

	  public class Reverse {
		  public static void main(String[] args) {
			int n = 1;
			for(int i = 10; i>=n; i--) {
				
				System.out.println(i);
			}
		}
	  }


}
