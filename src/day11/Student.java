package day11;

public class Student {

	
	//Variable 
	
    int id;
    String s;
    
    //Method
    
    void display()
    {
    	System.out.println("The Id Of "+ s+ "is:- "+id+ " "+"The name of this id ("+id+") is :-"+" "+ s+" ");
    }
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.id=123;
		s1.s="Gauri";
		
		s1.display();
		
		
	}
}
