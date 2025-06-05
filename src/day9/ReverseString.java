package day9;

public class ReverseString {
	
	public static void main(String[] args) {
		//Method1 - length() charAt()
        
		String s ="Welcome";
		
		System.out.println("Original String :----->>> " + s);
		
		String rev="";
		
		for(int i = s.length()-1; i>=0;i-- ) {
			rev = rev+s.charAt(i);
			
		}
		
		System.out.println("Reverse string:---->>>>>> " + rev);
	
	
	

		//Method 2 : By converting string to char type array toCharArray()
		
		  String s1 = "Welcome";
		  String rev1="";
		  char a[]=s1.toCharArray();
	       
		  
		  for(int i=a.length-1; i>=0;i--) {
			  
	        rev1 =rev1+a[i];
	        
		  
		  }
	       System.out.println("REverse string "+rev);	 
		  
		  //
		  
		  
		
	
	}
	
	
	

}
