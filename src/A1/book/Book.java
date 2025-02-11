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
}
