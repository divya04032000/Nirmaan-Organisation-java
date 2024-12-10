package day14;
import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Employee emp = new Employee();
		boolean istrue=true;
		while(istrue) {
		
		
		
		System.out.println ("Enter your choice");
		System.out.println ("Enter 1 is add");
		System.out.println ("Enter 2 is update");
		System.out.println ("Enter 3 is show");
		System.out.println ("Enter 0 is Exit");
	
		int a =sc.nextInt();
		sc.nextLine();
		
	switch(a)	{
	case 1:{
		 emp = new Employee("Divya","Science", 24, 2020348901);
		break;
	}
	case 2:
	{
		System.out.println ("Enter your name");
		String name= sc.nextLine();
		emp.setName(name);
		System.out.println ("Enter your Department");
		String dept= sc.nextLine();
		emp.setDept(dept);
		System.out.println ("Enter your Age");
		int age= sc.nextInt();
		emp.setAge(age);
		System.out.println ("Enter your Mobile Number");
		int mobileNo= sc.nextInt();
		emp.setMobileNo(mobileNo);
		break;
	}
	case 3:
	{
		System.out.println(emp);
		break;
	}
	case 4:
	{ 
		istrue=false;
		
		System.out.println ("Thanks for your visiting");
		break;
		
}
	default:
	{
		System.out.println ("Thanks you");
		System.out.println ("Welcome");
		break;
	}
		
	}
	}
	}
	 
	 

}
