package day13;

import java.util.Arrays;

public class CallingMainMethod {
	
	public static void main(String[] args) {
		 
		//By default JVM call the  main method 
		
		System.out.println("Length of array: "+args.length);
		
		System.out.println("Data in array:"+ Arrays.toString(args));// []    lenght=0
		
		if(args.length==0) {
			
			String[] ar= {"Welcome","to","java","Programming"};
			main(ar);
		}
	}
}
