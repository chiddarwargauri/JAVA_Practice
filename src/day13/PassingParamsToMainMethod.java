package day13;
import java.util.Arrays;

public class PassingParamsToMainMethod {

	
	public static void main(String[] args) {
		
		
		System.out.println("Length of array:-"+args.length);
		System.out.println("Data in Array:-"+Arrays.toString(args));
		
		for(String s:args) {
			System.out.println(s);
		}
	}
}
