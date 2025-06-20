package day12;

public class CallByValueAndCallByReferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        Example ex=new Example();
        
        //===================================Example call by value =======
        
        /*
       
        ex.callByValue(ex.data);
        System.out.println("otside call by value :-"+ex.data);
        
          * 
         */
        
        //=======================================Example of call by references =========
        
        ex.callByReferences(ex);
        System.out.println("Outside call by reference:-"+ex.data);
	}

}
