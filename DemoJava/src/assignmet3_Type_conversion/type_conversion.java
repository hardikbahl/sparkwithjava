package assignmet3_Type_conversion;
import java.util.Scanner;

public class type_conversion {
	
	public static Scanner sc;
	
    
	public static void main(String ar[]) {
	 //Java Program to convert int type variables to char
		
		sc = new Scanner(System.in);
		System.out.println("Enter value in int to convert to char");
		int IntVar =sc.nextInt();
		char CharVar = (char)IntVar;
		System.out.println("The number in char is "+CharVar);
	
		
		
		
	//Java Program to convert long type variables into int
		System.out.println("Enter value in long to convert to int");
		long LongVar = sc.nextLong();
		int IntVar2 = (int)LongVar;	
		System.out.println("The number in int is "+IntVar2);
		
		
	//Java Program to convert int type variables to long
		System.out.println("Enter value in int to convert to long");
		int longVar2=sc.nextInt();
		long IntVar3 = (long)longVar2;
		System.out.println("The number in long is "+IntVar3);
		
		
	//Java Program to convert boolean variables into string
		boolean bool = true;
		String str1 = String.valueOf(bool);
		System.out.println("The string value is "+str1);

		
		
	//Java Program to convert string type variables into boolean
		String str2 = "true";
		boolean bool2 = Boolean.parseBoolean(str2);
		System.out.println("The boolean value is "+bool2);
		
		
	//Java Program to convert string type variables into int
		System.out.println("Enter value in variable to convert to int");
		String str3 = sc.next();
		int intv2 = Integer.parseInt(str3);	
		System.out.println("The int value is "+intv2);
		
		
	//Java Program to convert int type variables to String
		String str4 = String.valueOf(intv2);
		System.out.println("The variable value is "+str4);
		
		
	//Java Program to convert int type variables to double
		double d1 = (double) intv2;
		System.out.println("The double value is "+d1);
	
		
	//Java Program to convert double type variables to int
		int intv4 = (int) d1;
		System.out.println("The int value is "+intv4);
	
		
		
	//Java Program to convert string variables to double
		double d2 = Double.parseDouble(str3);
		System.out.println("The doublr value is "+d2);
		
		
	//Java Program to convert double type variables to string
		String s5 = String.valueOf(d2);
		System.out.println("The string value is "+s5);
		
		
	//Java Program to convert primitive types to objects and vice versa
	    int v1 = 11;
	    double v2 = 14.50;
	    boolean v3 = true;

	    //converts into wrapper objects
	    Integer obj1 = Integer.valueOf(v1);
	    System.out.println(obj1);
	    Double obj2 = Double.valueOf(v2);
	    System.out.println(obj2);
	    Boolean obj3 = Boolean.valueOf(v3);
	    System.out.println(obj3);
}}
	