package day7;

import java.util.Arrays;

public class SortingArrays {

	public static void main(String[] args) {
		
		//+++++++++++++++++++++++++++++++++++++
		//Sorting elements - ascending order 
		
		
		int a []= {3,4,2,11,56};
		
		System.out.println("Before sorting the array : "+ Arrays.toString(a));
		
		
		// sort 
		
		Arrays.sort(a);
		
		System.out.println("After  sorting the array : "+ Arrays.toString(a));

		
		//+++++++++++++++++++++++++++++++++++
	}
}
