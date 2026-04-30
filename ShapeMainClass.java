 package inhiritancePrograms;

public class ShapeMainClass 
{

	public static void main(String[] args) 
	{
		Shapess s = new Shapess("Red",true);
	    s.GetArea(6);
	    s.Parameter(2);
	    Rectangle R = new Rectangle("Yellow",false,10,20);
	    R.override(5);
	    R.GetArea(122);
	    R.Getperimeter();
	    Circle C = new Circle("green",true,5,5,7);
	    C.override(4);
	    C.GetArea(2);

	}

}
class Shapess
{
	public String color;
	public boolean Fill;
	public Shapess (String color,boolean Fill)
	{
		this.color = color;
		this.Fill = Fill;
	}
	public void GetArea(double area)
	{
		System.out.println("Your Shape Area is"+area);
	}
	public void Parameter(double parameter)
	{
		System.out.println("Your Parameter is : "+parameter);
	}
}
class Rectangle extends Shapess
{
	public int width;
	public int height;
	public Rectangle(String color,boolean Fill,int width,int height)
	{
		super(color,Fill);
		this.width = width;
		this.height = height;
		
	}
	public void override(int area)
	{
		System.out.println("You will override");
	}
	public void GetArea(int area)
	{   area =  width*height;
		System.out.println("Rectangle area is "+area);
	}
	public void Getperimeter()
	{
		System.out.println("Rectangle perimeter is  ");
	}
}
class Circle extends Shapess
{
	public int Radius;
	public int height;
	public int width;
	public Circle(String color,boolean Fill,int Radius,int height,int width)
	{
		super(color,Fill);
		this.Radius = Radius;
	}
	public void override(int area)
	{
		System.out.println("You will override"+area);
	}
	public void GetArea(double area)
	{
		area =  width*height;
		System.out.println("Rectangle area is "+area);
	}
	public void Getperimeter(double area)
	{
		int parameter = 2*(width*height);
		System.out.println("Rectangle perimeter is  "+parameter);
	}	
	
}