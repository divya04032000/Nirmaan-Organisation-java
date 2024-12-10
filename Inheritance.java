package day13;

class Animal {
	void makeSound()
	{
		System.out.println("This animal makes a sound");
	
	}
	}
class Dog extends Animal
{
	@Override
	void makeSound()
	{
		System.out.println("The dog barks");
	
	}
}
	class Cat extends Animal
	
	{
		@Override
		void makeSound()
		{
			System.out.println("The cat meows");
		
		}
	
}
	public class Inheritance  {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog d= new Dog();
d.makeSound();
Cat c= new Cat();
c.makeSound();
	}

}


