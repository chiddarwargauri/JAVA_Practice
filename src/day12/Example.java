package day12;
/////////////Call by value

public class Example {
	
	int data= 50 ;
	
	/*
	 * 
	 * ----------------------call By value Example --------------------
	 void callByValue(int data)
	{
		 
		 data+=100;
		 System.out.println("Inside call b value:- "+data);
		 
		 
		 
	 }
	 */
	 //==========================================================================
	 //----------------------Call By references -----------------------
	 
	 void callByReferences(Example ex){
		 
		 ex.data+=100;
		 
		 System.out.println("Inside method call by references :- "+ ex.data);
	 }

}
