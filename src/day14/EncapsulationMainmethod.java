package day14;

public class EncapsulationMainmethod {
    public static void main(String[] args)
    {
    	
    	Encapsulationdemo e1= new Encapsulationdemo();
    	e1.setBalance(120000.6);
    	System.out.println(e1.getBalance());
    	
    	e1.setName("Gauri");
    	System.out.println(e1.getName());
    	
    	e1.setSalary(123000.34);
    	System.out.println(e1.getSalary());
    	
	
	
    }

}
