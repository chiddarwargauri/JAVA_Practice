package day13;

public class MainOverloadDemo {
	
	
	void main() {
		
		System.out.println("no paramether method :-1");
	}
	
	void main(String s) {
		
		System.out.println("method 2:-->"+s);
	}
	
	void main(String s1,String s2) {
		
		System.out.println("method 3:-->" +s1+" "+s2);
	}
	public static void main(String[] args) {
		
		
		 MainOverloadDemo m1= new MainOverloadDemo();
		 
		 m1.main();
		 m1.main("Gauri");
		 m1.main("Gauri","Chiddarwar");
	}

}
