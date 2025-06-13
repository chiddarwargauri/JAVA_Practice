package day11;

public class Student1main {

	public static void main(String[] args) {
		// initialization using reference variable 
		/*Student1 stu= new Student1();
		stu.roll_no=101;
		stu.name="Gauri";*/
		
		//using method
		/*Student1 stu = new Student1();
		stu.setData(101, "Gauri");*/
		
		//using constructor
		
		Student1 s1=new Student1(101,"Gauri"); 
		s1.display();
		
		
	}
}
