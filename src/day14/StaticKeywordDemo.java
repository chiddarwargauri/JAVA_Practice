package day14;

public class StaticKeywordDemo {
	
	// variable static and non static 
	static int department = 100;
	
	int roll_no;
	
	// methods static and non static 
	
	static void departmentdetails() {
		System.out.println(+department);
		//System.out.println(roll_no);//invalid 
		
		
	}
	
	void desplay() {
		System.out.println(+department);
		System.out.println(roll_no);
		
	}
	
  public static void main(String[] args) 
  
  {
	  
	  StaticKeywordDemo s = new StaticKeywordDemo();
	  
	  departmentdetails();
	  
	  
	  s.desplay();
	  
	
}
	
	

}
