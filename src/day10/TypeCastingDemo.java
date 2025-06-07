package day10;

public class TypeCastingDemo {

	public static void main(String[] args) {
		
		//WideningExample
		
		// Widening type casting means converting the smaller data type into larger data type 
		
		// Byte ->  short-> int-> long-> float -> double 
		
		byte b =100;
		int i=b;
		short s= b;
		long l = b ;
		float f = b;
		double d = b;
		
		
		System.out.println("Byte value: "+b);
		System.out.println("Short value: "+s);
		System.out.println("Int value: "+i);
		System.out.println("Long value: "+l);
		System.out.println("Float value: "+f);
		System.out.println("Double value: "+d);
		
		
		//Narrowing Casting (Larger to Smaller)
	    
		// double -> float -> long-> int-> short-> byte
		
		
		double d1 = 9.123456789;
		
		float f1 = (float)d1;
		long l1 =(long)f1;
		
		int i1 =(int)l1 ;
		short s1 = (short) i1;
		
		byte b1 = (byte)s1 ;
		
		
		System.out.println("------------------------------------------------------");
		
		System.out.println("Byte value: "+b1);
		System.out.println("Short value: "+s1);
		System.out.println("Int value: "+i1);
		System.out.println("Long value: "+l1);
		System.out.println("Float value: "+f1);
		System.out.println("Double value: "+d1);
		
		
		
		

		
		
		
		
		
		
		
	}
}
