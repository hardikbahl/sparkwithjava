package com.demo.staticdemo;

class Bank{
	
	static {
		System.out.println("step 1");
	}	
}

class Bank1{
	
	static {
		System.out.println("step 2");
	}
}

public class StaticDemo {
	
	public static void main(String arg[]) {
		
		int i=10;
		System.out.println("step 3"+ i);
		
		
		
		
		
	}

}
