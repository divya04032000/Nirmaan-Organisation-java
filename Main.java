package day11;

public class Main {

	public static void main (String []args)
	{
		Car c=new Car();
		c.displayCarDetails();
		Car c1=new Car("Tata");
		c1.displayCarDetails();
		Car c2=new Car("BMW", 2020);
		c2.displayCarDetails();
		
}
}