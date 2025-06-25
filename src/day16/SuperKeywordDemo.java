package day16;


class Parent 
{
	int a= 10;
	
	void start() {
		System.out.println("this is parent class method");
	}
	
	Parent(){
		
		System.out.println("this is parent class constructor");
	}
	
}

class Child extends Parent
{
	int a=20;
	
    void display() {
    	System.out.println("this is a child class method but it accessing the immidiate variable from the parent class"+super.a);
    }
    void start() {
     super.start();
    }
    Child(){
    	super();
    }
    
}





public class SuperKeywordDemo {
	
	public static void main(String[] args) {
		Child c = new Child();
		c.display();
		c.start();
	}

}
