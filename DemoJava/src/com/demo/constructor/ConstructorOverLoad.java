package com.demo.constructor;

class sub{
	sub(){
		System.out.println("hi");
	}
	sub(int i){
		System.out.println("overload demo "+i);
	}
	sub(double i, int j){
		System.out.println("overload demo "+i+" "+j);
	}
}

public class ConstructorOverLoad {
	public static void main(String arg[]) {
		
		sub s1= new sub();
		sub s2= new sub(3);
		sub s3= new sub(2,6);
		
	}
	
}
