package inhiritancePrograms;
interface BankService
{
	void deposite(double amount);
	void withdraw(double amount);
	void CheckBalance();
}
abstract class Account 
{
	protected String AccountHolder;
	protected double Balance;
	public Account(String AccountHolder,double Balance)
	{
		this.AccountHolder = AccountHolder;
		this.Balance = Balance;
	}
	public void Accountinfo()
	{
		System.out.println(" Account Holder : "+AccountHolder);
		System.out.println(" Balance        : "+Balance);
	}
}
class SavingAccount1 extends Account implements BankService
{

	public SavingAccount1(String AccountHolder, double Balance) 
	{
		super(AccountHolder, Balance);
	}

	@Override
	public void deposite(double amount) 
	{
		if(amount>0)
		{
			Balance+=amount;
			System.out.println(" Deposited : "+amount);
		}
		else
		{
			System.out.println(" invalid Deposite Amount");
		}
	}

	@Override
	public void withdraw(double amount) 
	{
		if(amount<=0)
		{
			System.out.println("invalid withdraw Amount ");
		}
		else if(amount>Balance)
		{
			System.out.println(" induffeciant Balance");
		}
		else
		{
			Balance-=amount;
			System.out.println("Withdrawn : "+amount);
		}
	}

	@Override
	public void CheckBalance() 
	{
		System.out.println("Current Balance : "+Balance);
	}
	
}
public class inheritanceEx5 
{

	public static void main(String[] args) 
	{
		SavingAccount1 S = new SavingAccount1("Ravi",1000);
		S.CheckBalance();
		S.deposite(1000);
		S.CheckBalance();
        S.withdraw(200);
        S.CheckBalance();
	}
	
}
