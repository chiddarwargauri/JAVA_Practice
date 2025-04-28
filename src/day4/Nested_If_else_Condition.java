package day4;

public class Nested_If_else_Condition {
	
	public static void main(String args[]) {
		
		int num1=23,num2=45,num3=23;
		
		if(num1>num2 && num1>num3)
			System.out.println("num1 is greater");
		
		else if(num2>num1 && num2>num3) {
			System.out.println("Num 2 is greater");
		}	
		else
		{
			System.out.println("num3 is greater");
		}
	}

}
