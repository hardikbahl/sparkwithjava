package assignment;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Main{
    public static void main (String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			DecimalFormat df=new DecimalFormat("########0.00");
			System.out.println("Enter the account number:");
			long accnum=sc.nextLong();
			System.out.println("Enter the initial balance");
			double balamt=sc.nextDouble();
			
			System.out.println("Enter the amount to be deposited:");
			double dep_amt=sc.nextDouble();
			
			Account obj= new Account(accnum, balamt);
			
			obj.deposit(dep_amt);
			System.out.println("Available balance is:"+df.format(obj.getBalanceAmount()));
			
			System.out.println("Enter the amount to be withdrawn:");
			double withdraw_amt=sc.nextDouble();
			
			if(obj.withdraw(withdraw_amt)==-1)
			{
			    System.out.println("Insufficient balance");
			}
			
			System.out.println("Available balance is:"+df.format(obj.getBalanceAmount()));
		}
    }
    
}