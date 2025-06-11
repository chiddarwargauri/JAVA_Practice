package day10;

public class TypeConvertionWithWrapperClassMethod {

	
	public static void main(String[] args) {
		
		//1. String -----> int.double.boolean.char
		
		//String-----> int
		
		//String s1= "Welcome"; // this can not be converted into int
		String s1= "10";
		String s2="20";
		
		//System.out.println(s1+s2);//1020;
		
		int sum=Integer.parseInt(s1)+Integer.parseInt(s2);
		System.out.println(sum);
		
		//---------------------------
		
		// String---> Double;
		
		String s3 = "10.5";
		String s4="20.0";
		
	  double sum1=Double.parseDouble(s3)+Double.parseDouble(s4);
	  
	  System.out.println(sum1+"----->>>>>Double");
		
	    
	  // String ---->> Boolean 
	  
	  
	  
	  String s5="true";
	  
	  boolean b=Boolean.parseBoolean(s5);
	  
	  System.out.println(b);
	  
	  
	  // String ------>>> Char ;
	  
	  
	  // Important things ... Thire is no method to convet the string to char 
	  
	  String s6= "A";
	  
	  
	  char ch =s6.charAt(0);
	  
	  System.out.println(ch);
	  
	  
	  //------->>>>>>
	  //2.int,double,boolean,char ----->>>String
	  
	   // int ---> String
	  
	  int i = 12;
	  
	  String s7= String.valueOf(i);
	  
	  System.out.println(s7);
	  
	  
	// double ---> String
	  
	  double d = 12;
		  
		  String s8= String.valueOf(d);
		  
		  System.out.println(s8);
		  
		  
		// Boolean ---> String
		  
		 boolean b1= true;
		  
		  String s9= String.valueOf(b1);
		  
		  System.out.println(s9);
		  
		  
		//  char-> String
		  
		 char ch2 = 'a';
		  
		  String s10= String.valueOf(ch2);
		  
		  System.out.println(s10);
		  
		  
		
		  
	  
	  
	  
	}
}
