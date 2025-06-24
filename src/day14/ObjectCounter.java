package day14;

public class ObjectCounter {
	
	static int objectcount=0;
	
	ObjectCounter(){
		
		objectcount++;
	}
	
  static  int displayOC() {
		
		return objectcount;
	}
	public static void main(String[] args) {
		
		ObjectCounter obc1= new ObjectCounter();
		ObjectCounter obc2= new ObjectCounter();
		ObjectCounter obc3= new ObjectCounter();
		ObjectCounter obc4= new ObjectCounter();
		ObjectCounter obc5= new ObjectCounter();
		ObjectCounter obc6= new ObjectCounter();
  
		System.out.println("Number objects:"+displayOC());

		
		
	}

}
