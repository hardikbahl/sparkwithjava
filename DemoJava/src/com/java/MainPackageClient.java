package com.java;
import com.demo.addition.AdditionDemo4;
import com.demo.subtraction.SubtractionDemo4;
public class MainPackageClient {
	
	public static void main(String arg[])
	{
		SubtractionDemo4 sub = new SubtractionDemo4();
		int resultofsub=sub.Subtraction(4,2);
		System.out.println("Result from main class " + resultofsub);
		AdditionDemo4 add= new AdditionDemo4();
		int resultofadd=add.Addition(4,2);
		System.out.println("Result from main class " + resultofadd);
	}

}


