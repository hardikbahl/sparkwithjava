package assignment2;

import java.util.Scanner;
public class numerlogy 
{
    public static Scanner sc;

	public static void main (String[] args)
    {
        int sum=0;
        int num_num=0;
        int odd_num=0;
        int even_num=0;
        int a=0;
        String str_num="";
        sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        while(num>0)
        {
            a=num%10;
            str_num=(char)(a+'0')+" "+str_num;
            sum+=a;
            if(a%2==0)
            {
                even_num++;
            }
            else
            {
                odd_num++;
            }
            num/=10;
        }
        num_num=sum;
        numerlogy obj=new numerlogy();
        while(num_num>9)
        {
            num_num=obj.num(num_num);
        }
        
       
        
        System.out.println("The Numbers are : "+str_num);
        System.out.println("Sum of digits : "+sum);
        System.out.println("Numerology number: "+num_num);
        System.out.println("Number of odd numbers: "+odd_num);
        System.out.println("Number of even numbers: "+even_num);
    
    }
    
    int num(int a)
    {   
        int ans=0, temp=a, r=0;
        while(temp>0)
        {
            r=temp%10;
            ans+=r;
            temp/=10;
        }
        return ans;
    }
}