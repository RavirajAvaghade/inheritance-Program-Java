package inhiritancePrograms;

public class AnimalMainClass 
{

	public static void main(String[] args) 
	{
		Animal  A = new Animal("Cat",2,3);
        A.info();
		A.Eat();
        A.Sleep();
        A.Sound();
        Dog D = new Dog("Dog",3,8,"Rootwiller",false);
        D.info();
        D.Bark();
        D.ftech();
        Cat C = new Cat("Cat",2,3,"Red",true);
        C.info();
        C.meow();
        C.Skracth();

	}

}
class Animal
{
	public String Name;
	public int Age;
	public int Weight;
	public Animal(String Name,int Age,int Weight)
	{
		this.Name = Name;
		this.Age = Age;
		this.Weight = Weight;
	}
	public void Eat()
	{
		System.out.println(Name+" is Eating a Food ");
	}
	public void Sleep()
	{
		System.out.println(Name+" Is Sleeping");
	}
	public void Sound()
	{
		System.out.println(Name+" is Make a Sound");
	}
	public void info()
	{
		System.out.println("Name  :"+Name);
		System.out.println("Age   :"+Age);
		System.out.println("Weight :"+Weight);
	}
}
class Dog extends Animal
{
	public String Bread;
	public boolean Trained;
	public Dog(String Name,int Age,int Weight, String Bread,boolean Trained)
	{ 
		super(Name,Age,Weight);
		this.Bread = Bread;
		this.Trained = Trained;
	
	}
	public void Bark()
	{
		System.out.println(Name+" Barking");
	}
	public void ftech()
	{
		 if (Trained) {
		        System.out.println(Name + " runs and fetches the ball!");
		    } else {
		        System.out.println(Name + " looks confused. Not trained yet.");
		    }
	}
}
class Cat extends Animal
{
	public String Color;
	public boolean Isindoor;
	public Cat(String Name,int Age,int Weight,String Color,boolean Isindoor)
	{
		super(Name,Age,Weight);
		this.Color = Color;
		this.Isindoor = Isindoor;
	}
	public void meow()
	{
		System.out.println(Name+" Make a meow Sound ");
	}
	public void Skracth()
	{
		System.out.println(Name+" was Skraching");
	}
}
