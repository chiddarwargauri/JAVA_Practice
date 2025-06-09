package day10;

public class WrapperClass {

	
	public static void main(String[] args) {
		
		// 1. Converting primitive  data to object type (Auto Boxing)
		
		int i = 10;
		double d= 10.5;
		char c= 'A';
		boolean b= true;
		
		//Integer iobj= new Integer(i);---- deprecate 
		Integer iobj =  i;
		
		System.out.println(iobj);
		
		
		double dobj=d;
		
		System.out.println(dobj);
		
		Character cobj = c;
		
	         System.out.println(cobj);
	         
	         Boolean bobj = b;
	         
	         System.out.println(bobj);
		
	         
	         // 2. Converting the object type of data into primitive type ---- up boxing 
	         
	         
	         int intvalue=iobj ;
	         
	         double doublevalue = dobj;
	         
	         char charvalue= cobj;
	         
	         boolean booleanvalue = bobj ;
	         
	         
	         System.out.println(intvalue);
	         
	         System.out.println(doublevalue);

	         
	         System.out.println(charvalue);

	         
	         System.out.println(booleanvalue);

	                
		
		
	}
}
