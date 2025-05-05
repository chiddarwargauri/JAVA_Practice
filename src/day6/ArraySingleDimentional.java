package day6;

public class ArraySingleDimentional {
	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=1;
		a[1]=10;
		a[2]=20;
		a[3]=40;
		a[4]=50;
		// extract the data using   simple for loop 
		
		System.out.println("-------------------------------------------------------------------------------------------------------");
        // extract the data using enhance of for each loop
		System.out.println("-----------------------------Extract the data using simple for loop------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------------------------------");

		for (int i = 0 ; i<a.length;i++) {
			
			System.out.println("The element presents in are are:-" + a[i]);
		}
		System.out.println("-------------------------------------------------------------------------------------------------------");
         // extract the data using enhance of for each loop
		System.out.println("-----------------------------Extract the data using enhance for loop------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------------------------------");

		for(int n:a) {
			System.out.println(n);
		}
		// size of array 
		
		  System.out.println(a.length);
		
	}
	

}
