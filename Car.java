package day11;

public class Car {
	
	String make;
	int year;
	
	Car() {
		this.make = "unknown";
		this.year =2000;
	}
	Car(String make) {
		this.make = make;
		this.year =2000;
	}
	
	Car(String make, int year) {
		this.make = make;
		this.year =year;
	}
	
	public void displayCarDetails ()
	{
		System.out.println(make);
		System.out.println(year);
	
	}
	
	
}

