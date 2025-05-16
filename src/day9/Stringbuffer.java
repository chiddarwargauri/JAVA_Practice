package day9;

public class Stringbuffer {
	
	public static void main(String[] args)
	
	{
		
		StringBuffer s = new StringBuffer("Gauri");
		
		// method no 1 
		
		// -------------------- 1>>>>>>>>>>>>>>> Append 
		
	StringBuffer s1=	s.append("Hello");
		 System.out.println(s1);
		
		 
		 // method no. 2 :- ----  replace
		 StringBuffer replace = s.replace(0,1 ," c");
		 
		 System.out.println(replace);
		 
		 
		 // Method no 3 :- Delete 
		 
		 StringBuffer delete = s.delete(1, 2);
		 System.out.println(delete);
		
		 
		 // Method no 4  :- insert 
		 
		StringBuffer insert = s.insert(3, " ! ");
		
		
		System.out.println(insert);
		 
		  
	}

}
