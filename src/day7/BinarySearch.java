package day7;
import java.util.Arrays;
public class BinarySearch {

	public static void main(String[] args) 
	
	{
		
	  int arr[]={12,34,56,23,56,2343,890};
	  int num= 890;
	   
	  // for binary search the first condition is for binary search all the alement is in a ascending order 
	  
	  // first task  make the order of the element in a ascending order 
	  
	  // to do this impoert the java.util.Arrays
	  
	  System.out.println("Before sorting "+ Arrays.toString(arr));
	  
	  Arrays.sort(arr);
	  
	  
	  System.out.println("After sorting "+ Arrays.toString(arr));
	  
	  
	  int i = Arrays.binarySearch(arr,num);// if not found the output it ive the negative number so that wwe do this if else 
	  
	  if(i>=0) {
		  
		  System.out.println("Element found  at "+i+" position");
		  
	  }
	  
	  
	  else {
		  
		  System.out.println("Eement not found "+i);
	  }

	  

	}

}
