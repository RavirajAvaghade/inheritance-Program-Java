package inhiritancePrograms;

public class LibraryItemMainClass
{

	public static void main(String[] args)
	{
		Library L = new Library("Man Mai he vishwas","Vishwas Nagre Patil",2014);
		L.GetDetails();
		L.Checkin("17-10-2025");
		L.CheckOut("20-10-2025");
		Book B = new Book("Panipat","vishwas",2012,"Patil",500);
		B.radExcerpt();
		B.GetDetails();
		DVD D = new DVD("Animal","Sandip wanga Readdy",2024,"3h20min","Sandip-wanga Readdy",1234);
		D.GetDetails();
		D.play();
		D.pause();
		
		
		

	}

}
class Library
{
	public String Title;
	public String Authore;
	public int Yearoffpublication;
	public Library(String Title,String Authore,int Yearoffpublication)
	{
		this.Title = Title;
		this.Authore = Authore;
		
		this.Yearoffpublication = Yearoffpublication;
	}
	public void CheckOut(String Date)
	{
		System.out.println("===============================");
		
		System.out.println(Title+" you have checkout"+Date);
        
		System.out.println("===============================");

		
	}
	public void Checkin(String Date)
	{
		System.out.println("===============================");

		System.out.println(Title+" You have Checkin"+Date);
		
		System.out.println("===============================");

	}
	public void GetDetails()
	{
		System.out.println("===============================");
        System.out.println("Title   :"+Title);
		System.out.println("Authore :"+Authore);
		System.out.println(" Yearoffpublication :"+Yearoffpublication);
	    System.out.println("===============================");
	
	}
}
class Book extends Library
{
	public String authore;
	public int pages;
	public Book(String Title,String Authore,int Yearoffpublication,String authore,int pages)
	{
		super(Title,Authore,Yearoffpublication);
		this.authore = authore;
		this.pages = pages;
	}
	public void radExcerpt()
	{
		System.out.println("===============================");
        System.out.println(Title+" you can read this book");
		System.out.println(" Read book and enjoy it");
		System.out.println("===============================");
	
	}
}
class DVD extends Library
{
	public String Duration;
	public String Direction;
	public int RegCode;
	public DVD(String Title,String Authore,int Yearoffpublication,String Duration,String Direction,int RegCode)
	{
		super(Title,Authore,Yearoffpublication);
		this.Duration = Duration;
		this.Direction = Direction;
		this.RegCode = RegCode;
	}
	public void play()
	{
		System.out.println("===============================");

		System.out.println(Title+" has been played");
	
	    System.out.println("===============================");

	}
	public void pause()
	{
		System.out.println("===============================");

		System.out.print(Title+" has been pause");
	
		System.out.println("===============================");
	
	}
}