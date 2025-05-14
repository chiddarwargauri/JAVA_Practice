package day8;

public class StringMethod {
public static void main(String[] args) {
	String s= "Gauri";
	
	 int length = s.length();
	 
	 System.out.println("Length:-" +length);
	 
	 char caratecter = s.charAt(4);
	 
	 System.out.println("Carecter at given index :- " +caratecter);
	 
	 
	 String sub= s.substring(4);
	 System.out.println("Substring :-" +sub);
	 
	 String sub2 = s.substring(0,3);
	 
	 System.out.println(sub2);
			
}
}
