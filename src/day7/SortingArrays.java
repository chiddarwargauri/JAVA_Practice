package day7 ;
import java.util.Arrays;
import java.util.Collections;
import java.util.Arrays;

public class SortingArrays
{
public static void main(String[] args) {
	int a[] = new int[4];
	 a[0]= 10;
	 a[1]=90;
	 a[2]=30;
	 a[3]=20;
	 
	 System.out.println(">>>>>>>>>>>>>>>>>>>>>>>Sorting array in acending order<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< ");
	 
	 System.out.println("Before Sorting Element in Array : -->>>" +Arrays.toString(a));
	 Arrays.sort(a);
	 System.out.println("After Sorting Element in Array : -->>>" +Arrays.toString(a));

	 
	String s[]= new String[4];
	s[0] ="Gauri";
	s[1] ="Prakash";
	s[2] ="Chiddarwar";
	s[3] ="Pranav";
	
	
	 
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>Sorting array in acending order<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< ");
	 
	 System.out.println("Before Sorting Element in Array : -->>>" +Arrays.toString(s));
	 Arrays.sort(s);
	 System.out.println("After Sorting Element in Array : -->>>" +Arrays.toString(s));

	
//______________________________________________________________________________________________________________________________________________________________________________
	 
	 
	 //Descending Order 
	 
	 System.out.println("_____________________Descendin order____________________________________________________________");
	 
	 Integer b[]= {13,34,112,10,1,3,9,14,4};
	 
	 System.out.println("Before= "+Arrays.toString(b));
	 
	 Arrays.sort(b , Collections.reverseOrder());
	 System.out.println("AFter = "+Arrays.toString(b));

	 


	
	
	
}	
}