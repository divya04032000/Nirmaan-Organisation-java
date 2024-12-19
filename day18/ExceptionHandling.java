package day18;
import java.util.Scanner;


public class ExceptionHandling {
	public static void main (String args[])
	{
			
Scanner sc=new Scanner (System.in);
System.out.println ("Enter A Value");
 int a=sc.nextInt();
 System.out.println ("Enter b Value");
 int b=sc.nextInt();
 int c=0;
 try {
     
     c=a/b;
     
}
        catch (Exception e)
        {
        	System .out.println (e);
        }
 System .out.println (c);
}
}