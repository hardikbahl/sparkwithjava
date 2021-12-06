package com.java;

class AdditionDemo{ //module
	void Addition() {
		
		int number1=10;
		int number2=20;
		String msg="The sum is ";
		int result=number1+number2;
		System.out.println(msg + result);
		
	}
	
}

class SubtractionDemo{ // module
	void Subtraction() {
		
		int number1=10;
		int number2=20;
		int subtract=number1-number2;
		System.out.println("The difference is "+ subtract);
		
	}
	
}

public class MethodDemo { //client class
	
	public static void main(String arg[])
	{
		AdditionDemo addition=new AdditionDemo(); //declaraloin of obj
		SubtractionDemo subtraction=new SubtractionDemo();
		
		addition.Addition();
		subtraction.Subtraction();
	}
	
}
