package com.java;





class SubtractionDemo1{ // module
	//passing parameter
	void Subtraction(int number1,int number2) {
		
		int subtract=number1-number2;
		System.out.println("The difference is "+ subtract);
		
	}
	
}

public class PassingParameterInMethodDemo {

	public static void main(String arg[])
	{
		
		SubtractionDemo1 subtraction=new SubtractionDemo1();
		
	
		subtraction.Subtraction(20,10); //calling from here
	}
}



