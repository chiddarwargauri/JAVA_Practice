package day13;

public class MethodOverloadingDemo {
	
int add(int a , int b)//-----------1.
{
	return a+b;
}

//====================================

double	add(double a, int b)//----------2.
{
	return a+b;
	
}

//========================================


double add (int b, double a)//-----------3.
{
	return b+a;
	
}

//=============================================



int add(int a , int b, int c)//-------------4.
{
	
	return a+b+c;
}

//============================================

double add(double a ,int b, int c)//---------5.
{
	
	return a+b+c;
}

//================================================
	
public static void main(String[] args) {
	
	MethodOverloadingDemo md= new MethodOverloadingDemo();
			
			System.out.println("Method 1:--> "+md.add(12, 13));
			
			System.out.println("Method 2:--> "+md.add(12.90,34));
	
	        System.out.println("Method 3:--> "+md.add(23, 34.67));
	        
	        System.out.println("Method 4:--> "+md.add(12,34,56));
	        
	        System.out.println("Method 5:-->"+md.add(12.45, 12,11));
	
}
}
