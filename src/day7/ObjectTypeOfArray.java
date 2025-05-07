package day7;
import java.util.Arrays;

public class ObjectTypeOfArray {
	public static void main(String[] args) {
		Object obj[] =new Object[5] ;
		 
		obj[1] =10;
		obj[0]=10.5;
		obj[2]='A';
		obj[3]="charecter";
		obj[4]=true;
		
		//+++++++++++++++++++++++++++++++++++++++++++++++++
		// --------------------Get specific data -------------------------
		
		System.out.println("----------------Get specific data -------------");
		
		System.out.println(obj[0]);
		
		// ++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		//-----------------------------Get the type of data --------------
		System.out.println("-------------Get the type of data ----------");
		
		
		System.out.println(obj[0].getClass().getSimpleName());
		
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		//-----------------------Extract the value in a array ++++++++++++++++++
		
		
		//-------------------------------For Each Loop -----------------------------
		
		System.out.println("-------------------For Each Loop -------------");
		
		for(Object i :obj)
		{
			
			System.out.println(i);
			
		}
		
		
		// ----------------------Simple for loop -----------------------------------
		
		System.out.println("-------------------Simple for loop ------------------------");
		
		
		for(int j=0;j<obj.length;j++)
		{
			System.out.println(obj[j]);
		}
      //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		//------------------read a array without using the loop 
		
		System.out.println(Arrays.toString(obj));
		
		
	}
	
	

}
