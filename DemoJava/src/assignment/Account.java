package assignment;

public class Account{
     long accNum;
     double balAmt;
    
    public Account(long accNum, double balAmt)
    {
        this.accNum=accNum;
        this.balAmt=balAmt;
    }
    
    public int withdraw(double amount)
    {
        if((this.balAmt-amount)>0)
        {   
            this.balAmt=this.balAmt-amount;
            return 1;
        }
        else
        {
            return -1;
        }
    }
    
    public void deposit(double amount)
    {
        this.balAmt=this.balAmt+amount;
    }
    
    public double getBalanceAmount()
    {
        return this.balAmt;
    }
    
}