package day3;

public class TernaryOperators {

	
	public static void main(String args[]) {
		
		System.out.println("--------------------------Ternary Operator-------------------------------------");
		
		// ExP ? out1 : out 2
		
int	a=5;

int b=7;

// Example 1


int res = (a==b) ? a : b;

System.out.println(res);


//Example 2 

int person_ag = 30;

String res1 =(person_ag >=18) ? "Eligible for vote" : "Not Eligible for vote" ;
System.out.println(res1);
	



	}
}
