package day9;

public class MutableVsImmutable {

	public static void main(String[] args) {
		
	
		//StringBuilder - Mutable 
		
		
		StringBuilder sb = new StringBuilder("Hello");
	   System.out.println("Original Value: "+sb);//Hello
	   
	   sb.append(" World");
	   
	   System.out.println("After Modification:"+sb);//Hello World
	   
	   
	 //StringBuffer - Mutable 
		
		
	 		StringBuffer sb1 = new StringBuffer("Hello Everyone ");
	 	   System.out.println("Original Value: "+sb1);
	 	   
	 	   sb1.append(" In My World");
	 	   
	 	   System.out.println("After Modification:"+sb1);
	 	 
	 	   
	 //String- IMMutable 
			
			
			String s = new String("Hello");
		   System.out.println("Original Value: "+s);//Hello
		   
		   s.concat(" World");
		   
		   System.out.println("After Modification:"+s);//Hello 
		   
		    	   
	 	   
	}
	
	
}
