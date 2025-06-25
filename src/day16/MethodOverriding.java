package day16;


class Employee{
	double calculateSalary() {
		return 0;
	}
}

class FullTimeEmployee extends Employee{
	
	@Override//----------this is called anitation 
	double calculateSalary() {
		return 500000;
	}
}

class PartTimeEmployee extends Employee{
	
	@Override//----------this is called anitation 
	double calculateSalary() {
		return 200000;
	}
}
public class MethodOverriding

{

	
	public static void main(String[] args) {
		
		FullTimeEmployee f= new FullTimeEmployee();
		System.out.println("salary of full time employee:-"+f.calculateSalary());
		
		
		PartTimeEmployee p=new PartTimeEmployee();
		
	System.out.println("Salary of part time Employee:- "+	p.calculateSalary());
		
		
		// runtime polymorphism 
		
		Employee e=new FullTimeEmployee();
System.out.println(		e.calculateSalary());	
		
	}
}
