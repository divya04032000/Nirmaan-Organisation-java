package day17;
import java.util.Scanner;

public class UserInterface implements IExample2 {

	

	@Override
	public String add(int a, int b) {
		// TODO Auto-generated method stub
		return "Addition : " +(a+b);
	}

	@Override
	public String sub(int a, int b) {
		// TODO Auto-generated method stub
		return "Substraction : " +(a-b);
	}

	@Override
	public String mul(int a, int b) {
		// TODO Auto-generated method stub
		return "Multiplication : " +(a*b);
	}
	@Override
	public String div(int a, int b) {
		// TODO Auto-generated method stub
		return "Division : " +(a/b);
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println ("Enter A Value");
		                int a = scan.nextInt();
		                System.out.println ("Enter b Value");
		                int b =scan.nextInt();
		                
		                System.out.println (); 
		                UserInterface u = new UserInterface ();
		                
		                System .out.println (u.add(a, b));
		                System .out.println (u.sub(a, b));
		                System .out.println (u.mul(a, b));
		                try {
		                
		             System .out.println (u.div(a, b));
	}
		                catch (Exception e)
		                {
		                	System .out.println ("Zero");
		                }
		                
}}
