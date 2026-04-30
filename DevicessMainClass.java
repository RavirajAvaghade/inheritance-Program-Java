package inhiritancePrograms;

public class DevicessMainClass 
{

	public static void main(String[] args)
	{
		Device D = new Device("Samsung","S27 Ultra","30W");
		D.Status();
		D.TurnOff();
		D.TurnOn();
		SmartPhone s = new SmartPhone("Apple","17promax","100percent","ios","Camera ",5000);
		s.TakePhoto();
        s.Call(" 8459867542");
        s.Status();
	    Laptop  L = new Laptop("HP","Victus","50%",512,"I5",100);
	    L.Status();
	    L.Compile();
	    L.RunApplication("instagrm");
	
	}   

}
class Device
{
	public String Brand;
	public String Model;
	public String PowerConsumption;
	public Device (String Brand,String Model,String PowerConsumption)
	{
		this.Brand = Brand;
		this.Model = Model;
		this.PowerConsumption = PowerConsumption;
	}
	public void  TurnOn()
	{
		System.out.println(Brand +" Will Be on");
	}
	public void TurnOff()
	{
		System.out.println(Brand +" Will be Off");
	}
	public void Status()
	{
		System.out.println("===========================");
		System.out.println("Brand :"+Brand);
		System.out.println("Model :"+Model);
		System.out.println("Power :"+PowerConsumption);
		System.out.println("===========================");

	}
}
class SmartPhone extends Device
{
	public String os;
	public String Camera;
	public int BattryCapacity;
	public SmartPhone(String Brand,String Model,String PowerConsumption,String os, String Camera,int BattryCapacity)
	{
		super(Brand,Model,PowerConsumption);
		this.os = os;
		this.Camera = Camera;
		this.BattryCapacity =BattryCapacity; 
	}
	public void TakePhoto()
	{
		System.out.println("===========================");

		System.out.println(Camera+"will be on take a photo");
		
		System.out.println("===========================");

	}
	public void Call(String Number)
	{
		System.out.println("===========================");
	
		System.out.println("Calling : "+Number);
	 
	    System.out.println("===========================");

	}
}
class Laptop extends Device
{
	public int Ram;
	public String Processor;
	public int Battarylife;
	public Laptop(String Brand,String Model,String PowerConsumption,int Ram,String Processor,int Battarylife)
	{
		super(Brand,Model,PowerConsumption);
		this.Ram = Ram;
		this.Processor = Processor;
		this.Battarylife =  Battarylife;
	}
	public void Compile()
	{   
		System.out.println("===========================");

		System.out.println("Your Code Will be Running SuccesFully");
	   
		System.out.println("===========================");

	}
	public void RunApplication(String AppName)
	{
		System.out.println("===========================");

		System.out.println(AppName+" will be Running");
		
		System.out.println("===========================");

	}
}