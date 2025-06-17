package patternPractice;

public class PatternNo_1
{
	
	/*
	 //------------Pattern No :->> 1-----------------
	     * 
	     ** 
	     *** 
	     ****
	 */
	
	public static void main(String[] args) 
	
	{
		for(int i=1; i<=4;i++) {
			
			for(int j = 1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	//--------------------------------------------------------------------------------------------------------------
	public class PatternNo_2
	{
		
		//------------------Pattern No:- > 2 ----------------------
		
		/*
		       ****
		       ***
		       **
		       *
		 
		 */
		
		
		public static void main(String[] args) 
		{
			for (int i1=1; i1<=4;i1++)
			{
				
				for(int j1=4;j1>=i1;j1--)
				{
					
					System.out.print("*");
				}
				System.out.println(" ");
			}
			
			
		}
		
		
	}
	
	//-----------------------------------------------------------------------------------------------------------
	

	public class PatternNo_3
	{
		public static void main(String[] args)
		{
			
			//---------------Pattern No :--> 3--------------------
			/*
			          ---*
			          --**
			          -***
			          ****
			 */
			
			//-----------------------------------
			
			
			for(int i2=1; i2<=4;i2++) 
			
			{
				
				for(int j2 = 3; j2>= i2;j2--) 
				{
					
					System.out.print(" ");
					
				}
				
				for(int k2=1;k2<=i2;k2++)
				{
					System.out.print("*");
				}
				System.out.println( );
				
				
			}
			
			
		}
	}
	
	public class PatternNo_4
	{
		/*
		          ****
		          -***
		          --**
		          ---*
		 */
		public static void main(String[] args)
		{
			
			for(int i3= 1; i3<=4; i3++)
			{
			
				for(int j3 = 2; j3<= i3; j3++)
				
				{
				System.out.print(" ");
				}
				
				for(int k3=4; k3>=i3;k3--) {
					System.out.print("*");
				}
				
				System.out.println(" ");
			}
			
			
			
		}
		
	}
	
	public class PaatternNo_5{
		
		/*     
		
		   *    
		  ***   
		 *****  
	    *******
		
		*/
		public static void main(String[] args) {
			
			for(int i4= 1; i4<=4;i4++)
			{
				
				for(int j4= 3;j4>=i4; j4--)
				{
					
					System.out.print(" ");
				}
				
				for(int k4= 1; k4<=i4;k4++)
				{System.out.print("*");
				
				}
				
				for(int m4= 2; m4<=i4;m4++)
				{System.out.print("*");
				
				}
				for(int l4= 3;l4>=i4; l4--)
				{
					
					System.out.print(" ");
				}
				System.out.println(" ");
				
			}
			
		}
		
		
	}
	
	public class PatternNo_5b{
		
		public static void main(String[] args) {
			
		  // Another logic below pattern
			

			/*     
			
			   *    
			  ***   
			 *****  
		    *******
			
			*/
			
			
			
			for(int i5=1; i5<=4;i5++) 
			{
				
				for(int j5=3; j5>=i5;j5--);
				
				{
					
					System.out.print(" ");
					
				}
				 for(int k5=1;k5<=(i5*2-1);k5++) {
					 
					 System.out.print("*");
				 }
				 
				System.out.println();
				
				
			}
			
			       
		}
		
		
		
	}
	
	public class PatternNo_6
	
	{
		public static void main(String[] args)
		{
			
			for(int i6= 1; i6<=4; i6++)
			
			{
			
				
				for(int j6= 3;j6>=i6;j6--) {
					System.out.print("-");
				}
				for(int k6=1; k6<=i6;k6++) {
					System.out.print("* ");
				}
				System.out.println();
				
			}
		}
	}


}

