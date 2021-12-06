package com.java;


class SubtractionDemo2{ // module
	//passing parameter
	int Subtraction(int number1,int number2) {
		
		int subtract=number1-number2;
		return subtract;
	}
	
}

public class ReturnTypeWithPassingParameterDemo {

	public static void main(String arg[])
	{
		
		
		
		SubtractionDemo2 subtraction=new SubtractionDemo2();
		
	
		 
		int resultOfSub= subtraction.Subtraction(20,10);
		System.out.println("Result from main class is "+resultOfSub);
	}
}




