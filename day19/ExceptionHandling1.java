package day19;

import java.util.Scanner;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		 try {
			 
			 System.out.println("Enter Your Age:" );
			 
			 int age = scan.nextInt();
			  if(age>0)
			  {
				  System.out.println(age);
			  } else {
			  throw new ArithmeticException ();
		 }
		 }
		 catch (ArithmeticException e)
		 {
			 System.out.println(e);
		 }
		 finally {
			 System.out.println("Always work");
			 
			 
		 }
		 System.out.println("Program finish");
	}

}
