package inhiritancePrograms;

public class BankAccountMainClass
{
  public static void main(String[]args)
  {
	  Bank b = new Bank(225524,"Raviraj",200);
	  b.Deposite(500);
	  b.Withdraw(1000);
	  b.DislayBalance();
	  b.info();
	  SavingAccount S = new SavingAccount(225524,"Raviraj",200,5.5);
	  S.AddInterest();
	  CurrentAccount C = new CurrentAccount(225524,"Raviraj",200,1000);
	  C.Deposite(2000);
	  C.CheckoverDraft();
  
  
  }

}
class Bank
{
	public int AccNum;
	public String AccHolderName;
	public int Balance;
	public Bank(int AccNum,String AccHolderName,int Balance)
	{
		this.AccNum = AccNum;
		this.AccHolderName = AccHolderName;
		this.Balance = Balance;
	}
	public void Deposite(double amount)
	{   
		Balance+=amount;
		System.out.println("====================================");
		System.out.printf("You have deposited %.0f RS\n", amount);
		System.out.println("====================================");

		
	}
	public void Withdraw(double amount)
	{
          if (amount > Balance) 
          {
	        System.out.println("Insufficient balance. Withdrawal failed.");
	      } 
          else 
          {
	         Balance -= amount;
	 		System.out.println("====================================");
            System.out.println("You have withdrawn " + amount + " RS");
    		    System.out.println("====================================");
	      
          }
	}
	public void DislayBalance()
	{
		System.out.println("====================================");
        System.out.println("Your Account Balance Is "+Balance+" RS ");
	    System.out.println("====================================");
	
	}
	public void info()
	{
		System.out.println("====================================");
		System.out.println("Account Number :"+AccNum);
        System.out.println("Account Holder Name :"+AccHolderName);
        System.out.println("Balance:"+Balance);
		System.out.println("====================================");
		System.out.println("====================================");
       
	}
}
class SavingAccount extends Bank
{
	public double intresRate;
	public SavingAccount(int AccNum,String AccHolderName,int Balance,double intresRate)
	{
		super(AccNum,AccHolderName,Balance);
		this.intresRate=intresRate;
	}
	public void AddInterest()
    {
	   double interest = (Balance * intresRate) / 100;
	   Balance += interest;
	   System.out.printf("Interest of %.2f RS added. New Balance: %d RS\n", interest, Balance);
	}
}
class CurrentAccount extends Bank
{
	public int OverDraft;
	public CurrentAccount(int AccNum,String AccHolderName,int Balance,int OverDraft)
	{
	 super(AccNum,AccHolderName,Balance);
	 this.OverDraft = OverDraft;
	
	}
	public void CheckoverDraft()
	{
	        if (Balance < 0) 
	        {
	            System.out.println("Account is in overdraft.");
	            System.out.println("Overdraft used: " + (-Balance) + " RS");
	            System.out.println("Remaining overdraft limit: " + (OverDraft + Balance) + " RS");
	        } 
	        else 
	        {
	          System.out.println("Account is not in overdraft.");
	          System.out.println("Available balance: " + Balance + " RS");
	          System.out.println("Full overdraft limit available: " + OverDraft + " RS");
	        }
	
	}
}
