package Day12;

public class Book {
	
	private String BookName;
	private double BookPrice;
	private String BookAuthor;
	private int noofcopies;
	Book() {}
	public String getBookName() {
		return BookName;
	}
	public double getBookPrice() {
		return BookPrice;
	}
	public String getBookAuthor() {
		return BookAuthor;
	}
	public int getnoofcopies() {
		return noofcopies;
	}
	public void setBookName(String BookName) {
		this.BookName=BookName;
	}
	public void setBookPrice(double BookPrice) {
		this.BookPrice=BookPrice;
	}
	public void setBookAuthor(String BookAuthor) {
		this.BookAuthor=BookAuthor;
	}
	public void setNoofcopies(int noofcopies) {
		this.noofcopies=noofcopies;
	}
	public String toString() {
		return "Book is: "+BookName+"\nBook Author is: "+BookAuthor+"\nBook Price is: "+BookPrice+"\nNo of copies  is: "+noofcopies;
	}
	
	}
	
	


