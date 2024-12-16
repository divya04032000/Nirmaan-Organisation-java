package day16;

public class Dog implements Animal{
	@Override
	
	public void move()
	{
		System.out.println("The dog run on four legs");
	}
@Override
	
	public void speak()
	{
		System.out.println("The dog Says: Woof Woof!");
	}

public static void main (String args[])
{
	Dog d = new Dog();
	d.move();
	d.speak();
	System.out.println(Animal.isMammal("Dog"));
	System.out.println(Animal.name);
}
}