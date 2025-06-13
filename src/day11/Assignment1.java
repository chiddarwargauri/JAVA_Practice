package day11;

public class Assignment1{

	
	/*Assignment 1: Basic Class and Object Creation
	• Objective: Create a simple class with attributes and methods.
	• Task:
	o Define a class named Car with attributes: make, model, and year.
	o Create a method displayInfo() that prints the details of the car.
	o In the main method, create an object of the Car class, set values for the attributes,
	and call the displayInfo() method to display the car’s details.
*/
	
	
	public static void main(String[] args) {
		//---------------------Question No:- 1--------------------
		/*Car c = new Car();
		c.make="A.S>Manakar";
		c.model="Defenser";
		c.year=2020;
		c.displayInfo();*/
		
		
		
		//-------------------------Question No:- 2----------------------
         Car c2=new Car("GAuri" ,"Defeser" ,2020);
		
		 c2.displayInfo();
		

	}
}
