package Day1;
import java.util.Scanner;


public class calculator {
public static void main(String args[]) {

	Scanner lol = new Scanner(System.in);
	System.out.println("Enter the option");
	System.out.println("0 for add");
	System.out.println("1 for sub");
	System.out.println("2 for multiplication");
	System.out.println("3 for division");
	System.out.println("4 for modulus");
	System.out.println("Choose the option :");
	

int on =lol.nextInt();
System.out.println("Enter the no : ");
int fn=lol.nextInt();
	System.out.println("Enter the second no :");

	int sn=lol.nextInt();
	
//	if (on == 0) {
//		int tn=fn+sn;
//		System.out.println("Answer = "+tn);
//	}
//	else if (on == 1){ 
//		int tn=fn-sn;
//		System.out.println("Answer = "+tn);
//	}
//	else if (on == 2){ 
//		int tn=fn*sn;
//		System.out.println("Answer = "+tn);		
//	}
//	else if (on == 3){ 
//		int tn=fn/sn;
//		System.out.println("Answer = "+tn);	
//	}
//	else if (on == 4){
//		int tn=fn%sn;
//		System.out.println("Answer = "+tn);
//	}
	
	switch (on) {
	case 0: {
		int tn=fn+sn;
		System.out.println("add :"+tn);
		break;
	}
	case 1: {
		int tn=fn-sn;
		System.out.println("subtraction :"+tn);
		break;
	}
	case 2: {
		int tn=fn*sn;
		System.out.println("multiplicaton :"+tn);
		break;
	}
	case 3: {
		int tn=fn/sn;
		System.out.println("divisin :"+tn);
		break;
	}
	case 4: {
		int tn=fn%sn;
		System.out.println("modulus :"+tn);
		break;
	}
	default: {
		System.out.println("Enter the correct option");
	
	
	}
	}
}

	

	
	}


	

	


