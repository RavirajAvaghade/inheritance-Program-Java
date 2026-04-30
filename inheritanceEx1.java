package inhiritancePrograms;

public class inheritanceEx1 {

	public static void main(String[] args) 
	{
      Animal1 A = new Animal1("Cat",2,2);
      A.eat();
      A.sleep();
      A.sound();
      A.info();
     
      Dog1 D = new Dog1("Dog",10,11,"rotwiller",true);
      D.Bark();
      D.ftech();
      
      Cat1 C = new Cat1("cat",2,2,"red",true);
      C.meow();
      C.Skrecth();
      C.eat();
      
	}

}
class Animal1
{
	protected String Name;
	private int age;
	private int weight;
	public Animal1(String Name,int age,int weight)
	{
		this.Name = Name;
		this.age = age;
		this.weight = weight;
	}
	public void eat()
	{
		System.out.println(Name+" is eating food");
	}
	public void sleep()
	{
		System.out.println(Name+" slepping");
	}
	public void sound()
	{
		System.out.println(Name+" is making sound");
	}
	public void info()
	{
		System.out.println("=====================");
		System.out.println(Name +": Name");
		System.out.println(age  +": age ");
		System.out.println(weight+": weight");
		System.out.println("======================");
	}
}
class Dog1 extends Animal1
{

	private String Bread;
	private boolean istrained;
	
	public Dog1(String Name, int age, int weight,String Bread,boolean istrained)
	{
		super(Name, age, weight);
		this.Bread = Bread;
		this.istrained = istrained;
	}
    public void Bark()
    {
    	System.out.println(Name+" barking");
    }
    public void ftech()
    {
    	if(istrained)
    	{
    		System.out.println(Name+" is trained ftech the ball");
    	}
    	else
    	{
    		System.out.println(Name+" is not trained look like confuse");
    	}
    }

	
}
class Cat1 extends Animal1
{

	protected String color;
	protected boolean isindoor;
	public Cat1(String Name, int age, int weight,String color,boolean isindoor) 
	{
		super(Name, age, weight);
		this.color = color;
		this.isindoor = isindoor;
	}
	public void meow()
	{
		System.out.println(Name+" Make a Meow Sound");
	}
	public void Skrecth()
	{
		System.out.println(Name+" was Skracthing");
	}
}