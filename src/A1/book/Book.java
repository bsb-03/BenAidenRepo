package A1.book;

public class Book {
	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	public static Book newBook() { // default constructor
		Book newBook = new Book();
		
		newBook.title = "Unknown"; 
		newBook.author = "Unknown";
		newBook.ISBN = "Unknown";
		newBook.price = 0.0;
		
		return newBook;
	}
	
	public static Book newBook(String title, String author, String ISBN, double price) { // parameterized constructor
		Book newBook = new Book();
		
		newBook.title = title;
		newBook.author = author;
		newBook.ISBN = ISBN;
		newBook.price = price;
		
		return newBook;
	}
	
	public static Book newBook(Book bookToCopy) { // copy constructor
		Book newBook = new Book();
		
		newBook.title = bookToCopy.getTitle();
		newBook.author = bookToCopy.getAuthor();
		newBook.ISBN = bookToCopy.getISBN();
		newBook.price = bookToCopy.getPrice();
		
		return newBook;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() { // overridden toString()
		return ("Title: " + this.getTitle() + ", Author: " + this.getAuthor() + ", ISBN: " + this.ISBN + ", Price: " + this.getPrice());
	}
}
