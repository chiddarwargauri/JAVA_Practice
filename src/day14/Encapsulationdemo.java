package day14;

public class Encapsulationdemo {
//Encapsulation means wrapping of data and behavior into single unit 
	
	/*
	 * The rules of the Encapsuation 
	 * 1.variable declaration must be in private acces modefier 
	 * 2.the data must be update set or retrive  through only method 
	 *   a. getter -- to retrive the data 
	 *   
	 *   b.setter--to set and update the data 
	 *   3. only through method get and set the data 
	 *   
	*/
	
	// variable 
	
	private double balance ;
	private String name ;
    private double salary ;
    
	
    
	
    // method for each  variable getter and setter method 
    
    double getBalance() {
    	return balance ;
    }
    
    void setBalance(double balance) {
    	
    	this.balance=balance;
    } 
	
    String getName() {
    	
    	return name;
    }
    
    void setName(String name) {
    	
    	this.name=name;
    	
    }
    
    double getSalary() {
    	return salary;
    }
    
    void setSalary(double salary) {
    	
    	this.salary=salary;
    	
    	
    
    
    }
	
}
