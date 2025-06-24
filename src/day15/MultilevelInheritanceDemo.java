package day15;

 class device
 {
	 
	 void PowerOn() {
		 System.out.println("device is powered on");
		 
	 }
	 
	 
 }
 
 class mobile extends device
 {
	 void call() {
		 System.out.println(" call from mobile ");
	 }
 }
 
 class smartphone extends mobile  
 {
	 void browse() {
		 System.out.println("browsing from smartphone");
	 }
	 
 }

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		
		 smartphone sp= new  smartphone();
		 sp.browse();
		 sp.call();
		 sp.PowerOn();
		
		 
		 
	}
}
