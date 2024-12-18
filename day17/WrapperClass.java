package day17;

public class WrapperClass {
	public static void main (String args [])
	{
 int num=10;
 Integer autoBoxingInt=num;
 System.out.println(autoBoxingInt) ;
 int unBoxing=autoBoxingInt;
 System.out.println(unBoxing) ;
 
 long number=1234567l;
 Long autoBoxinglong=number;
 System.out.println(autoBoxinglong) ;
 long unBoxing1=autoBoxinglong;
 System.out.println(unBoxing1) ;
 
 byte numb1=123;
 Byte autoBoxing=numb1;
 System.out.println(autoBoxing) ;
 byte unBoxing2=autoBoxing;
 System.out.println(unBoxing2) ;
 
 short numb2=25000;
 Short autoBoxing1=numb2;
 System.out.println(autoBoxing1) ;
 short unBoxing3=autoBoxing1;
 System.out.println(unBoxing3) ;
 
 float numb3=3.45f;
 Float autoBoxing2=numb3;
 System.out.println(autoBoxing2) ;
 float unBoxing4=autoBoxing2;
 System.out.println(unBoxing4) ;
 
 double numb4=98.95684334;
 Double autoBoxing3=numb4;
 System.out.println(autoBoxing3) ;
 double unBoxing5=autoBoxing3;
 System.out.println(unBoxing5) ;

}
}