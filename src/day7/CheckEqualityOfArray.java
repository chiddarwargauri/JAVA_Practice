package day7;

import java.util.Arrays;

public class CheckEqualityOfArray {
	
	public static void main(String[] args)
	
	{
		
		int array1[] = {12,34,1,45,56};
		
		int array2[] = {12,34,1,45,56};
		
		int array3[] = {13,23,12};
		
		int array4[] = {12,55,67,3,12};
		
		// Method 1: using the equals method 
		
		
		boolean result = Arrays.equals(array1, array3) ;
		
		System.out.println("are arrays are equales or not equale ???------>>>> answer is " +result);
		
		
		
		// Method 2 
		
		
		boolean isArrayEquales = true ;
		
		
		if(array1.length !=array2.length) {
			 
			 isArrayEquales = false;
			 
			System.out.println("are arrays are equales or not equale ???------>>>> answer is" + isArrayEquales);
			
		}
		
		else {
			
			for(int i=0; i<array1.length ;i++) {
				
				
				if(array1[i]!=array2[i]) {
					
					 isArrayEquales = false;
						System.out.println("are arrays are equales or not equale ???------>>>> answer is" + isArrayEquales);

					 break;
				}
				
				
			}
			System.out.println("are arrays are equales or not equale ???------>>>> answer is" + isArrayEquales);

			

			
		}
		
		
				
				
				
		
		
		
	}

}
