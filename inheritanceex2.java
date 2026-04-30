package inhiritancePrograms;
interface a
{
	void show();
}
interface b
{
   void display();	
}
class test implements a,b
{

	@Override
	public void display() 
	{
		System.out.println(" Display method");
	}

	@Override
	public void show() 
	{
		System.out.println(" Show method");
	}
	
}
public class inheritanceex2 
{
	
	public static void main(String[] args) 
	{
        test t = new test();
        t.display();
        t.show();
	}

}
