package day1;
import java.util.Scanner;

public class Project {
	public static void main (String args[])
	{
		Scanner sc=new Scanner (System.in);
		
		System.out.println ("Enter the number");
		System.out.println ("0 for add:");
		System.out.println ("1 for sub:");
		System.out.println ("2 for mul:");
		System.out.println ("3 for div:");
		int key =sc.nextInt();
		System.out.println ("Enter your first number:");
int firstNum=sc.nextInt();
		System.out.println ("Enter your second number:");
		int secondNum=sc.nextInt();
	if(key==0) {
	int total= firstNum + secondNum;
		System.out.println("Addition" + total);
	
}
//	else if(key==1)
//	{
//		int total= firstNum - secondNum;
//		System.out.println("Substraction" + total);
//	}
//	else if(key==2)
//	{
//		int total= firstNum * secondNum;
//		System.out.println("Multiplication" + total);
//	
//	}
//	else if(key==3)
//	{
//		int total= firstNum / secondNum;
//		System.out.println("Division" + total);
//	
//	}
//	else if(key==3)
//	{
//		int total= firstNum % secondNum;
//		System.out.println("Modulus" + total);
//	
//	}
	switch (key)
	{
	case 0:
	{
      int total= firstNum + secondNum;

	System.out.println("Addition"+total);
	break;
	}
	
	case 1:
	{
	int total= firstNum -secondNum;

	System.out.println("substraction"+total);
	break;
	}
	case 2:
	{
		int total= firstNum * secondNum;
	System.out.println("Multiplication"+total);
	break;
	}
	case 3:
	{
		int total= firstNum / secondNum;
	System.out.println("division"+total);
	break;
	}
	case 4:
	{
		int total= firstNum % secondNum;
		System.out.println("Modulation"+total);
	break;
	}
	default:
	System.out.println("Enter the correct choice");
	}
	
}
}
