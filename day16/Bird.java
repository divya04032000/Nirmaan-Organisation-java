package day16;

public class Bird implements Animal{
	@Override
	
	public void move()
	{
		System.out.println("The bird flies in the sky");
	}
@Override
	
	public void speak()
	{
		System.out.println("The bird Says: Chirp Chirp");
	}
public static void main (String args[])
{
	Bird b = new Bird();
	b.move();
	b.speak();
	System.out.println(Animal.isMammal("Bird"));
	System.out.println(Animal.name);
}
}
