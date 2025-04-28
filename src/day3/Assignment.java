package day3;

public class Assignment {
	
	public static void main(String args[]) {
		//----------------------------------------------------------------------------------------------------------
		
		//-----------------Question no:1 -------------- 
		
		// swap two numbers without using third variable 
		
		System.out.println("**************Swap two numbers without using third variable******************");

		int a =10 , b=20;
		
	   System.out.println("-------------------------Before Swaping two variable----------------------");
	   System.out.println("The Value of a is:  "+ a );
	   System.out.println("The value of b is: "+b);
	   
	   //  Method 1:----> logic of swapping
	   
	/*   a=a+b;//30
	   b=a-b;//30-20=10(b)
	   a=a-b;//30-10=20(a)
	   */
	   
	   // Method 2: --------> Logic of Swapping
	   
	   a=a^b;
	   b=a^b;
	   a=a^b;
	   
	   System.out.println("-------------------------After Swaping two variable----------------------");
	   System.out.println("The Value of a is:  "+ a );
	   System.out.println("The value of b is: "+b);
	   
	   //******************************************************************************************************************
	   
	   
	   // ----------------------Question No : 2-----------------------------------------------
	   
	   // Find the Area of Rectangle & perimeter of rectangle 
	   
	  System.out.println("===================Area Of Rectange & perimeter of Rectangle================");
	  
	  int len = 12 , bre=10 , Area, perimeter;
	  
	  System.out.println("The Value of length is:  "+ len );
	  System.out.println("The value of breath is: "+bre);
	   
	   // Logic of finding Area of rectangle
	   
	   Area = len * bre;
	   
	   System.out.println("Area Of Rectangle is: "+Area);
	   
	   // Logic of finding perimeter of rectangle
	   
	   perimeter = 2*(len+bre);
	   
	   System.out.println("Perimeter Of rectangle is :" +perimeter);
	   
	   //=======================================================================================================
	   
	   // -------------------------------Question No : 3-------------------------------------
	   
	   
	   System.out.println("Convert celsius to fahrenheit");
	   
	   int c = 25, f;
       // logic 
	   
	   f= (c * 9/5)+32;
	   
	   System.out.println("fahrenheit:" +f);
	   
	   //=================================================================================================
	   
	   // ------------------------Question No : 4------------------------------------------
	   
	   System.out.println("_______________________Simple Intrest__________________________");
       double p=13, r=14,time=4;
       // logic
       double SI = p*r*time/100;
      

       System.out.println("The Value of Principle is:  "+ p );
 	   System.out.println("The value of Rate is: "+r);
 	   System.out.println("The value of Time is:"+time);
       
       System.out.println("Simple Intrest is :"+SI);
 
       
	 //====================================================================================================
       
       // ----------------------------Question No : 5 ---------------------------------------
       
       System.out.println("-----------------------Average of double value -----------------");
       
       double num1 =123.34, num2=456.124, num3=678.345;
       
       double avg= num1+num2+num3/3;
       
       System.out.println("The average is :"+ avg);
       

	   
	   
	   

	}

}
