package inhiritancePrograms;

public class EmployyeMainClass {

	public static void main(String[] args) 
	{
		Employee E = new Employee("Raviraj",1234,100000);
		E.Empinfo();
		E.increment(5);
		E.leave(10);
		E.workStatus();
		SalesPerson S = new SalesPerson("Raju",2345,10000,100,5);
		S.Empinfo();
		S.makesells(200);
		S.CommisionRate();
		SupportStaff S1 = new SupportStaff("Ramesh",6789,25000,"Day",true);
		S1.SupportInfo();
		S1.HandleTicket();
		S1.Report();
	}

}
class Employee
{
	public String Name;
	public int Empid;
	public int Salary;
	public Employee(String Name,int Empid,int Salary)
	{
		this.Name = Name;
		this.Empid = Empid;
		this.Salary =  Salary;
	}
	public void increment(double percent)
	{   
		System.out.println("=========================================");
		
        System.out.println(" You increment will be "+percent+" % ");
	    
		System.out.println("=========================================");

	}
	public void leave(int days)
	{
		System.out.println(" you got leave "+days+" Days");
	}
	public void workStatus()
	{
		System.out.println(Name+" is currently working "+" Empid "+ Empid);
	}
	public void Empinfo()
	{
        System.out.println("=========================================");
		System.out.println("Name   :" +Name);
		System.out.println("Empid  :" +Empid);
		System.out.println("Salary :" +Salary);
		System.out.println("=========================================");

	}
}
class SalesPerson extends Employee
{
	public int Totalsale;
	public int Commision;
	public SalesPerson(String Name,int Empid,int Salary,int Totalsale,int Commision)
	{
		super(Name,Empid,Salary);
		this.Totalsale = Totalsale;
		this.Commision = Commision;
	}
	public void makesells(double amount)
	{
		System.out.println(Name+" Product total amount You have Sell is "+amount);
	}
	public void CommisionRate()
	{
		System.out.println("=========================================");

		System.out.println("Your commision rate is "+Commision+"%");
		
		System.out.println("=========================================");
	
	}
	public void Sinfo()
	{   		
		System.out.println("=========================================");
        System.out.println("Name      :" +Name);
	    System.out.println("Empid     :" +Empid);
	    System.out.println("Salary    :" +Salary);
		System.out.println("Totalsale :" +Totalsale);
		System.out.println("Commision :" + Commision);
		System.out.println("=========================================");

	}
}
class SupportStaff extends Employee
{
	public String Shift;
	public boolean Ticket;
	public SupportStaff(String Name,int Empid,int Salary,String Shift,boolean Ticket)
	{
		super(Name,Empid,Salary);
		this.Shift = Shift;
		this.Ticket = Ticket;
		
	}
	public void HandleTicket()
	{
		System.out.println(Name+" Handled Ticket");
	}
	public void Report()
	{
		System.out.println("=========================================");

		System.out.println("Report "+ Name + Empid);

		System.out.println("=========================================");

	}
	public void SupportInfo()
	{   
		System.out.println("=========================================");
		System.out.println("Name   :"  +Name);
		System.out.println("Empid  :"  +Empid);
		System.out.println("Salary :"  +Salary);
		System.out.println("Shift  :"  +Shift);
		System.out.println("Ticket :"  +Ticket);
		System.out.println("=========================================");

	}
}