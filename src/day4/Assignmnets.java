package day4;

public class Assignmnets {
	
	public static void main(String args[]) {
		
		System.out.println("__________________IF Statement____________________________________");
		
		System.out.println("__________________if..else Statement______________________________");
		
		
	}
	
	//-------------------Question No 3 ---------------------
	
	
	//3. Write a program that takes a year as input and checks if it is a leap year.

	
	public class LeapYear{
		public static void main(String args[])
		{
			int year = 2024;
			
			///////////logic divided by 4 
			
			
			if(year%4==0 || year%400==0){
				System.out.println("this year is leap year");
			}
			
		}
	}
	
	
	//----------------------------------------------------------------------------
	
	
	//4. Write a program that takes a character as input and checks if it is an uppercase letter.

	
	public class Uppercase{
		
		public static void main(String args[]) {
			
			char a='A';
		
			if(a=='A' || a=='Z' ) {
				System.out.println("this charecter is in uppercase ");
			}
			
		}
	}
	
	
	//-----------------------------------------------------------------------------------
	
	//5. Write a program that takes an integer input and checks if the number is a multiple of 10.

	
	public class Multiple_of_Ten{
		
		
		public static void main(String args[]) {
			int num= 25;
			
			if(num%10==0) {
				
				System.out.println("This number is mltiple of 10");
			}
		}
	}
	
	//---------------------------------Question No: 1-----------------------------------------------------
	
	//1. Write a program that takes an integer input and determines whether it is even or odd.

	public class EvenOdd{
		
		public static void main(String args[]) {
			int num= 12;
			
			if(num%2==0) {
				
				System.out.println("This number is even");
			}
			
			else {
				
				System.out.println("This Number is odd");
			}
			
			
		}
	}
	
	
	//----------------------------Question No : 2--------------------------------------------
	
	//2. Write a program that takes an age as input and checks if the person is a teenager (age
	//between 13 and 19).
	
	public class Teenager{
		
		public static void main(String args[]) {
			
			int person_age= 13;
			
			if(person_age>=13 && person_age<=19) {
				
				System.out.println("This person is teenager");
			}
			
			else {
				System.out.println("This person is  not teenager");
				
				
			}
			
		}
	}
	
	//---------------------------Question No : 3---------------------------------------------------
	
	//3. Write a program that takes two integers as input and prints the larger number.
	
	public class LargeNumber{
		
		public static void main(String args[]) {
			int num1= 23 , num2=50;
			
			if(num1>num2) {
				
				System.out.println("This number is largest");
			}
			else
			{
               System.out.println("This number is Smallest");
			}
			
		}
	}
	
	//------------------------ Question no : 4------------------------------------------------------
	
	//4. Write a program that takes an integer input and checks if the number is positive, negative, or
	//zero
	
	public class PositiveNegativeZero{
		public static void main(String args[]) {
			
			int n = 3;
			
			if(n>0) {
				System.out.println("Number is positive");
			}
			
			else if(n ==0) {
				System.out.println("Zero");
			}
			
			else {
				System.out.println("Negative");
			}
		}
	}
   
	
	//--------------------------Question no : 5-----------------------------------------------------------
	
	//Write a program that takes an age as input and checks if the person is eligible for a senior
	//citizen discount (age >= 60).
	
	
	public class SeniorCitizenDiscount{
		public static void main(String args[]) {
			
			int person_age= 61;
			
			if(person_age>=60) {
				
				System.out.println("Eligible For a senior citizen discount");
			}
		}
	}
   
	
	///Nested if_ else -------------------------------------------------------
	
	// ------------------------------Question No : 1 ------------------------------------------------------
	
     	
	//*1. Write a program that takes an integer input and checks if it is both positive and even.

	
	public class positive_even {
		
		public static void main(String args[])
		{
		       int num = 1;
		        if(num>0)
		    {
		    	if(num%2==0) {
		    		
		    		System.out.println("number is even and Positive");
		    	}
		    	
		    	
		    	else {
		    		
		    		System.out.println("Number is positive");
		    	     }	
		    }
		    
		    else {
		    	
		    	System.out.println("Number is not even and positive ");
		    	
		    }
		
		 }
		}
	//--------------------------------Question NO:- 2------------------------------------------
	
	//2. Write a program that takes a character as input and checks if it is an uppercase vowel.

	
	 public class UpperCaseVowel{
		 public static void main(String args[]) {
			 
			 char ch='a'; 
					 
					 
					 if( ch=='a' || ch =='e' || ch =='i' || ch =='o' || ch=='u') 
					 {
						 
						 System.out.println("this is a lower case vowel");
						 {
							 
							 if(ch=='A' || ch =='E' || ch =='I' || ch =='O' || ch=='U') 
							 {
								 
								 System.out .println("This is upperase vowel");
							 }
						 }
					 }
					 
					 else {
						 System.out.println("this is consonent");
					 }
		 }
		 
		 
	}
	 
	 //===========================================================================================
	 
	 
	 //---------------------------Question No : 3---------------------------------------------
	 
	 
	 
	

	
	
	


}


