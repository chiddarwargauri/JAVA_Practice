package day11;

public class Employee {

	//Variable
	
	String name;
	
	int id;
	int salary;
	
	// method
	
	void Display() {
		
		System.out.println(name+" "+id+" "+salary+" ");
	}
	
	void getSalary()
	{
		System.out.println("The salary of employee is:-"+salary);
	}
	
	
	//create object
	
	public static void main(String[] args) {
		Employee emp1= new Employee();
		emp1.name= "Gauri";
		emp1.id= 123;
		emp1.salary=200000;
		emp1.Display();
		emp1.getSalary();
	}
}
