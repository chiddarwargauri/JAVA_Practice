package day12;

public class ShoppingCart {
 // variable
	
	double total_price= 0.0;
	
	//Method
	//single parameter
	void addItem(double price) //parameter
	{
		
		total_price= total_price+price;
		
		System.out.println("Item added:- "+price);
	}
	
	// triple parameter.....
	
	void addItem3(double price1,double price2, double price3) {
		
		total_price= total_price+price1+price2+price3;
		System.out.println("Items added:--"+price1+" "+price2+ " "+price3+" ");
	}
	// multiple parameter------------
	
	
	void addMultipleItems(double... prices)
	{
		for(double price4:prices) {
			
			total_price=total_price+price4;
			
			System.out.println("ItemAdded:----"+price4);
		}
		
	}
	void display() {
		
		System.out.println("Total amount of in the cart: "+total_price);

	}
	
	public static void main(String[] args) {
		ShoppingCart obj=new ShoppingCart();
		
		//---------Single parameter--------
		//obj.addItem(23.23);//Argument
		//obj.display();
		//--------Triple parameter-------
		
		/*obj.addItem3(12.4, 45.44, 23.4);
		
		obj.display();
		*/
		
		//--------Multiple parameter ------
		
		
		obj.addMultipleItems(12.44, 454.23,355.23,23.45);
		
		obj.display();
		
		
	}
}
