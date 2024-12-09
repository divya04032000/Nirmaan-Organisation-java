package Day12;

import java.util.Scanner;

public class Main {
			public static void main(String args[]) {
				Book book= new Book();
				Scanner sc = new Scanner(System.in);
				boolean istrue=true;
				while(istrue) {
				System.out.println("Enter the choice:");
				System.out.println("Enter  1 for Add or update a Book Details:");
				System.out.println("Enter  2 for Display a Book Details:");
				System.out.println("Enter  0 for Exit:");
				int key=sc.nextInt();
				sc.nextLine();
				switch(key) {
				case 1:
				{
					System.out.println("Enter a Book name:");
					String bookName=sc.nextLine();
					book.setBookName(bookName);
					System.out.println("Enter the price of Book:");
					double bookPrice=sc.nextDouble();
					book.setBookPrice(bookPrice);
					System.out.println("Enter the Book Author:");
					String bookAuthor=sc.nextLine();
					sc.nextLine();
					book.setBookAuthor(bookAuthor);
					System.out.println("Enter The No Of copies Wants:");
					int noofcopies=sc.nextInt();
					book.setNoofcopies(noofcopies);
					break;
				}
				case 2:
				{
					System.out.println(book);
					System.out.println();
					break;
				}
				case 3:
				{
					istrue=false;
					System.out.println("Thank You!");
					break;
				}
				default:
				{
					System.out.println("Enter the valid choice");
					break;
				}

				}
				}
			sc.close();
}
}

				
					
				

				
			
			

		






