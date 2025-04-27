package day3;

public class IncrementOperator {
	public static void main(String args[])
	{
		
		int a= 10;
		// -----------Case 1 : same variable  --No difference
		//a=a+1;
		//a++;//post increment 
		// ++a;//pre incremment 
		System.out.println(a);//11
		
		//------------Case 2 : 
		
		/*int res=a++;
		System.out.println(res);// 10
		System.out.println(a);///11*/
		
		//----------- CASE 3;
		
		int res= ++a;
		System.out.println(res);//11
		System.out.println(a);
		// 
		
		
	}

}
