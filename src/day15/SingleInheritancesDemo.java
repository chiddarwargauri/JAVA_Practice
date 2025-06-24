package day15;

	class CarBrand
	{
		String brand ="Maruti Suzuki";
		
		void start() 
		{
			
			System.out.println("car is starting... ");
			
		}
	}
	
	
	class CarModel extends CarBrand
	{
		String model="Swift";
		
		void display() 
		{

         System.out.println("Brand ---->>>>"+brand);
         
         System.out.println("Model ---->>>>"+model);
			
		}
		
	}
	
public class SingleInheritancesDemo 

{
	public static void main(String[] args) 
	
	{
		//-----------------------------this is only for accessing the parent class data and behaviours 
		
		CarBrand cb=new CarBrand();//-----valid 
		cb.start();
		
		//---------------------------This is acess both parent and child class methods and also the variables 
		
		CarModel cm =new CarModel();//-------valid 
		cm.display(); 
		
		//--------------------------can here possible upcasting ? let's try it 
		CarBrand cb1=new CarModel();//----------valid 
		
		cb1.start();
		
		//-----------------------can here possible downcasting? let try it 
		
		// CarModel cm1=new CarBrand(); invalid 
		
		
		//case 4  : throws run time //java.lang.ClassCastException: 
		
		CarModel  ca=(CarModel) new CarBrand ();   // Child class variable is holding Parent class object //Down casting
											//Type casting is needed
										//java.lang.ClassCastException: 
				
				System.out.println(ca.brand);
				System.out.println(ca.model);
				ca.start();
				ca.display();
				
		
		
		
		
	}
}
