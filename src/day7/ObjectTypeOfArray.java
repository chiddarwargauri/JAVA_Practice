package day7;

import java.util.Arrays;
public class ObjectTypeOfArray{
	
	public static void main(String[] args)
	{
		
		Object o[]=new Object[5];//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>It can store a Object type of s data like Integer,Double, Boolean ,Character
		o[1] = 12;
		o[0]='A';
		o[2]=12.9;
		o[3]="Gauri";
		o[4]=true;
		
		
		// read a specific type of a data
		
		System.out.println(o[3]);//"Gauri"
		
		System.out.println("Type:---->>>>>>" +o[2].getClass().getSimpleName());//DOUBLE
		
		System.out.println("Class --->>>>" +o[4].getClass() );
		
		
		// read a array using simple for loop 
		
		//-----------------------------------------------
		
          System.out.println(">>>>>>>>>>>>>>>>>>>>>>>> read a array using simple for loop <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		
		for(int i=0;i<o.length;i++) 
		{
			System.out.println(o[i]);
		}
		
		//------------------------------------------------------
		
		
		//Read the data using for each loop 
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>> read a array using for each loop  <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		
		
		for(Object var:o)
		{
		   System.out.println(var );	
		   
		}
		
		
		// Read the data without using array
		
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>.............Read The data without using for loop .........<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		
		System.out.println(Arrays.toString(o));
		
		

		
		
		
		
	}
}