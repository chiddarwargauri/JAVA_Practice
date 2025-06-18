package day12;

public class BankAccount {
	// Different ways to Create Methods in Java
	
			//1. No parameter and no return value
			//2. No parameter and return value
			//3. takes parameter and no return values 
			//4. Takes parameters and Returns a values
		
	//-------------------------------------------
	// variables
	
	
	double balance;
	
	double interestRate;
	
	//--------------------------------------------
	
	//constructor
	
	BankAccount(double bal, double interest){
		 balance=bal;
		 interestRate=interest;
		 
		 
	 }
	 
	//--------------------------------------
	// Methods
	       //------------------
	
	          //1. No parameter and no return value

	 
	 void checkBalance() {
		 System.out.println("Balance:= "+balance);
	 }
	 
	 
	          //-------------------------------------
	 
	         		//2. No parameter and return value
	 
	 double getInterestRate() {
		 
		 return interestRate;
				 
	 }
	 
	       //==========================================
		      //3. takes parameter and no return values 
    
        void deposit(double amount) {
        	
        	if(amount >0) {
        		balance+=amount;
        		System.out.println("Diposit amount:-"+amount);
        	}
        	else {
        		System.out.println("amount must be greater than zero / amount must be positive");
        	}
        }
        
            //==========================================
        
                // 			//4. Takes parameters and Returns a values

        boolean withdraw(double amount) {
        	if(amount>0 && amount<=balance) {
        		
        		balance-=amount;
        		System.out.println("withdraw amountL-" +amount);
        		
        		return true;
        	}
        	else {
        		
        		System.out.println("Insufficent ammount");
        		return false;
        	}
        }
	 // main method
	 
	public static void main (String args[]) 
	{
		BankAccount obj= new BankAccount(120.23,56.26);
              obj.checkBalance();
		//====================================
     	double store_interest_rate	=obj.getInterestRate();// if  any method return somethind must be stored it into variable
	    System.out.println("Interest rate is "+store_interest_rate);
		//==========================================
	    
	    obj.deposit(235.98);
	    obj.checkBalance();
	     //==========================================
	    
	    boolean withrawresult=obj.withdraw(56.0);
	    
	   if (withrawresult==true) {
		   obj.checkBalance();
	   }
	 
	}
}
