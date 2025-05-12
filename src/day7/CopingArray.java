package day7;
import java.util.Arrays;
public class CopingArray {
   public static void main(String[] args) {
	
	   System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>Coping Array <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	   
	   
	   
	   //-____________________________________________________Method 1: loop
	   
	   
	   int originalarray[]= {12,45,123,45,35};
	   int copingarray[] =new int[originalarray.length];
	   
	   for(int i=0;i<originalarray.length;i++) 
	   {
		   copingarray[i]=originalarray[i];  
		   
	   }
	   
	   System.out.println("the copy array of original array ->>" +Arrays.toString(originalarray)+"is --->>"+Arrays.toString(copingarray));
	   
	   
	   
	   
	   
	   //_______________________________________	   Method to buid in element ____________________________________
	   
	   
	   int resultcopy[] =Arrays.copyOf(originalarray, originalarray.length);
	   
	   System.out.println("MEthod No: 2 Builin method :-  "+ Arrays.toString(resultcopy));
	   
	   
	   // ___________________________________________Method Three:System.ArrayCopy  _____________________________________________
	   
	   
	   int systemcopy[] = new int [originalarray.length];
	   
	   System.arraycopy(originalarray, 0, systemcopy, 0, originalarray.length);
	   System.out.println("MEthod third output is " + Arrays.toString(systemcopy));
	   
	   
	  //_______________________________________________Method Fourth : clone method _______________________________________________________
	   
	   
	   int copy [] =originalarray.clone();
	   
	   System.out.println("Method no 2 : clone() output is "+ Arrays.toString(copy) );
	   
}
	
	
	
	
	
	
}
