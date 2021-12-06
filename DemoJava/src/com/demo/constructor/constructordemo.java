package com.demo.constructor;

class Add{
	//constructor with no parameter
	static {
		System.out.println("loading main modules");
	}
	Add(){
		
		int i=1;
		int j=7;
		int c=i+j;
		System.out.println("Sum of 2 nos is "+c);	
				
				
		
	}
	void add() {
		int i=1;
		int j=7;
		int c=i+j;
		System.out.println("Sum of 2 nos is "+c);	
	}
	//with parameter
	Add(double i,double j){
		double c=i+j;
		System.out.println("Sum is "+c);
	}
	
}

public class constructordemo {
	
	public static void main(String arg[]) {
		
		Add add = new Add();
		Add add1 = new Add(2.5,9);
		
		add.add();//calling method
	}

}
