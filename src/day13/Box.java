package day13;

public class Box {
	
	double width ,length, height;
	
	Box(){
		
		width=length=height=0;
		
		
	}
	
	Box(double side){
		width=length=height=side;

	}
	
	Box(double width, double length,double height){
		this.width=width;
		this.length=length;
		this.height =height;
		

	}
	
	double valumn() {
		
		return width*length*height; 
	}
	public static void main(String[] args) {
		
		
		Box b1=new Box();
		
		System.out.println("Constructor default No-1:--> "+b1.valumn());
		
		Box b2=new Box(2.0);
		System.out.println("Constructor parameterizes no:2 --> "+b2.valumn());

		
		Box b3=new Box(5.6,8.9,7.8);
		System.out.println("Constructor paramererizes no-3--> "+b3.valumn());
		
		Box b4=new Box(2,5,10);  //valid
		System.out.println(+b4.valumn());
		
	}

}
