package day6;

public class DoubleDimentionalArray {

	public static void main(String[] args)
	
	{ 
	    System.out.println("-------------------------------------------Double Dimentional array ---------------------------------------------------");	
	    
	    System.out.println("=========================================================================================================================");
	    
	    int arr[][] = new int[2][2];
	      arr[0][0]=100;
	      arr[0][1]=200;
	      arr[1][0]=300;
	      arr[1][1]=400;
	      
	      // ================================ Find the size of the array =====================================
	      
	      System.out.println("The size of row is : "+arr.length);
	      System.out.println("The size of column is : "+arr[0].length);
	      
	      //================================= Extract element in the two dimentional array ===========================================================
	      
	      System.out.println("------------------------------------------Read Exlements in array using nested for loop ---------------------------------");
	      
	      for (int r =0 ; r <arr.length ; r++) 
	      {
	    	  for(int c =0 ; c<arr[r].length; c++)
	    	  {
	    		  System.out.print(arr[r] [c] + " ");
    	    	  }
	    	  System.out.println(" ");
	      }
	    
	    
	}

}
