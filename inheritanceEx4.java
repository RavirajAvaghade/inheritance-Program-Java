package inhiritancePrograms;
interface PowerControl
{
	void turnon();
	void turnoff();
}
interface Connectivity
{
	void Connectwifi();
	void disconnectwifi();
}
class Device1
{
  protected String Name;
  protected String Brand;
  
  public Device1(String Name,String Brand)
  {
	  this.Name = Name;
	  this.Brand = Brand;
  }
  public void info()
  {
	  System.out.println("===================");
	  System.out.println(" Device : "+Name);
	  System.out.println(" Brand  : "+Brand);
	  System.out.println("====================");
  }
	
}
class Tv extends Device1 implements PowerControl,Connectivity
{

	private boolean ison;
	private boolean isconnected;
	
	public Tv(String Name, String Brand) 
	{
		super(Name, Brand);
	}

	@Override
	public void Connectwifi() 
	{
		if(ison)
		{
			isconnected = true;
			System.out.println(" wifi connected");
		}
		else
		{
			System.out.println("Turn ON TV first");
		}
	}

	@Override
	public void disconnectwifi() 
	{
		isconnected = false;
		System.out.println(" wi fi Disconnected");
	}

	@Override
	public void turnon() 
	{
		ison = true;
		System.out.println(Name+" is on ");
	}

	@Override
	public void turnoff() 
	{
		ison = false;
		System.out.println(Name+" is off");
	}
	
}

public class inheritanceEx4 
{

	public static void main(String[] args) 
	{
        Tv T = new Tv("Smart Tv","Samsung");
        T.turnon();
        T.Connectwifi();
        T.info();
        T.disconnectwifi();
        T.turnoff();
	}

}
