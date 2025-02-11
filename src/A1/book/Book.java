package A1.book;

public class Book {
	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	public static Book newBook() { // default constuctor
		Book newBook = new Book();
		
		newBook.title = "Unknown"; 
		newBook.author = "Unknown";
		newBook.ISBN = "Unknown";
		newBook.price = 0.0;
		
		return newBook;
	}
	
}
