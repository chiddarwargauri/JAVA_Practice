package patternPractice;

public class PatternNo_1 {
	
	/*
	 //------------Pattern No :->> 1-----------------
	     * 
	     ** 
	     *** 
	     ****
	 */
	
	public static void main(String[] args) {
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
		public static void main(String[] args) {
			
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


}

