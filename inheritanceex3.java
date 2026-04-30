package inhiritancePrograms;

interface A
{
	void show();
}
interface B
{
	void display();
}
class Test implements A,B
{

	@Override
	public void display() 
	{
		System.out.println(" hiii");
	}

	@Override
	public void show() 
	{
		System.out.println(" hello");
	}
	
}
public class inheritanceex3 
{

	public static void main(String[] args) 
	{
        Test t = new Test();
        t.display();
        t.show();
        		
	}

}
