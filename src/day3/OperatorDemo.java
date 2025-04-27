package day3;

public class OperatorDemo {
	
	public static void main(String args[]) {
		// Arithmetic operator
		
		int a= 10 , b=20;
		System.out.println("*-------------------------This is Arithmetic Operator---------------------------------*");
		
	   System .out.println("this is sum of a and b is" +(a+b));
	   System.out.println("This is Multiplication of s and b" +(a*b));
	   System.out.println("This is the division of a and b " + (a/b));
	   System.out.println("This is the subtraction on a and b" +(a-b));
	   System.out.println("This is the modulus of a and b" +(a%b));
		 
	   
	     // Relational or Comparison operator 
	    
	   // REturn boolean value 
	   System.out.println("*---------------------------------This is relational or Comparison Operator ------------------------------*");
	   System.out.println("the a is greater than b:"+ " " +(a>b));// false
	   System.out.println("the a is less than b:"+ " " +(a<b));//true
	   System.out.println("The a is equal to b:"+ " "+(a==b));//false
	   System.out.println("The a is greater than or equal to b:"+ " "+(a>=b));//false
	   System.out.println("The a is less than or equal to b:"+ " " +(a<=b));//true
	   System.out.println("The a is not qual to b :"+ " " +(a!=b));//true
	   
	   
	   //Logical Operator -------------> 1.AND =(&&)  2. OR=(||)   3.NOT(!) 
	   
	   // Return Boolean values
	   Boolean x=true;
	   Boolean y = false;
			   
	   
	   System.out.println("*-------------------This is a logical operator ------------------------------------------------*");
	   System.out.println(x && y);//false 
	   System.out.println(x || y);// true
	   System.out.println(!x);// false
	   System.out.println(!y);//true  
	}
   
}
